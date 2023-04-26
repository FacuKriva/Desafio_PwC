package org.PwC_Desafio.controller;

import org.PwC_Desafio.model.Departamentos;
import org.PwC_Desafio.service.impl.DepartamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/departamento")
public class DepartamentosController {

    @Autowired
    private DepartamentosService departamentosService;

    //---------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    /* Listar a todos los profesores de un sólo departamento */
    @GetMapping("/{id}/profesores")
    public ResponseEntity<Departamentos> listarProfesoresPorDepartamento(@PathVariable Long id) {
        return ResponseEntity.ok((Departamentos) departamentosService.listarProfesoresPorDepartamento(id));
    }
    //----------------------------------------------------------------------------------------------------
    // Adicional

    /* Creamos un departamento */
    @PostMapping
    public ResponseEntity<Departamentos> crearDepartamento(@RequestBody Departamentos departamento) {
        return ResponseEntity.ok(departamentosService.registrarDepartamento(departamento));
    }

    /* Buscamos un departamento por su id */
    @PostMapping("/{id}")
    public ResponseEntity<Departamentos> buscarDepartamento(@PathVariable Long id){
        Departamentos departamentoABuscar = departamentosService.buscarDepartamentoPorId(id);

        if(departamentoABuscar == null){ return ResponseEntity.notFound().build(); }

        return ResponseEntity.ok(departamentoABuscar);
    }

    /* Modificamos un departamento */
    @PutMapping("/{id}")
    public ResponseEntity<Departamentos> modificarDepartamento(@PathVariable Long id, @RequestBody Departamentos departamento) {
        Departamentos departamentoAModificar = departamentosService.buscarDepartamentoPorId(id);

        if(departamentoAModificar == null){ return ResponseEntity.notFound().build(); }

        departamentoAModificar.setNombre(departamento.getNombre());
        return ResponseEntity.ok(departamentosService.modificarDepartamento(departamentoAModificar));
    }

    /* Eliminamos un departamento */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDepartamento(@PathVariable Long id){
        departamentosService.eliminarDepartamento(id);
        return ResponseEntity.ok().build();
    }
}
