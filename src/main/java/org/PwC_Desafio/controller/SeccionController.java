package org.PwC_Desafio.controller;

import org.PwC_Desafio.model.Seccion;
import org.PwC_Desafio.service.impl.SeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/seccion")
public class SeccionController {

    @Autowired
    private SeccionService seccionService;

    @PostMapping
    public ResponseEntity<Seccion> crearSeccion(@RequestBody Seccion seccion) {
        return ResponseEntity.ok(seccionService.registrarSeccion(seccion));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Seccion> buscarSeccionPorId(@PathVariable Long id){
        Seccion seccionABuscar = seccionService.buscarSeccionPorId(id);
        if(seccionABuscar == null){ return ResponseEntity.notFound().build(); }
        return ResponseEntity.ok(seccionABuscar);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Seccion> modificarSeccion(@PathVariable Long id, @RequestBody Seccion seccion) {
        Seccion seccionAModificar = seccionService.buscarSeccionPorId(id);
        if(seccionAModificar == null){ return ResponseEntity.notFound().build(); }
        seccionAModificar.setNombreSeccion(seccion.getNombreSeccion());
        return ResponseEntity.ok(seccionService.modificarSeccion(seccionAModificar));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarSeccion(@PathVariable Long id){
        seccionService.eliminarSeccion(id);
        return ResponseEntity.ok().build();
    }

}
