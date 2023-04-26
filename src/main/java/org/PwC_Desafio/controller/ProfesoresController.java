package org.PwC_Desafio.controller;

import org.PwC_Desafio.model.Profesores;
import org.PwC_Desafio.service.impl.ProfesoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profesores")
public class ProfesoresController {

    private ProfesoresService profesoresService;

    @Autowired
    public void setService(ProfesoresService profesoresService) { this.profesoresService = profesoresService; }

    //---------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    @PutMapping("/{id}")
    public ResponseEntity<Profesores> cambiarDepartamento(@PathVariable Long id, @RequestParam Long idDepartamento) {
        return ResponseEntity.ok(profesoresService.cambiarDepartamento(id, idDepartamento));
    }
    //----------------------------------------------------------------------------------------------------
    // Adicional

    @PostMapping
    public ResponseEntity<Profesores> crearProfesor(@RequestBody Profesores profesor) {
        return ResponseEntity.ok(profesoresService.crearProfesores(profesor));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profesores> buscarProfesor(@PathVariable Long id){
        Profesores profesorABuscar = profesoresService.buscarProfesoresPorId(id);

        if(profesorABuscar == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(profesorABuscar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProfesor(@PathVariable Long id){
        profesoresService.eliminarProfesores(id);
        return ResponseEntity.ok().build();
    }
}
