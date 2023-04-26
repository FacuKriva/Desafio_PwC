package org.PwC_Desafio.controller;

import org.PwC_Desafio.model.Cursos;
import org.PwC_Desafio.service.impl.CursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/curso")
public class CursosController {

    @Autowired
    private CursosService cursosService;

    //---------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    /* Listamos todos los estudiantes en un curso especifico */
    @GetMapping("/{id}/estudiantes")
    public ResponseEntity<Cursos> listarEstudiantes(@PathVariable Long id) {
        return ResponseEntity.ok((Cursos) cursosService.listarEstudiantesPorCurso(id));
    }
    //----------------------------------------------------------------------------------------------------
    // Adicional

    /* Creamos un curso */
    @PostMapping
    public ResponseEntity<Cursos> crearCurso(@RequestBody Cursos curso) {
        return ResponseEntity.ok(cursosService.registrarCurso(curso));
    }

    /* Buscamos un  curso por su id */
    @GetMapping("/{id}")
    public ResponseEntity<Cursos> buscarCurso(@PathVariable Long id){
        Cursos cursoABuscar = cursosService.buscarCursoPorId(id);

        if(cursoABuscar == null){ return ResponseEntity.notFound().build(); }

        return ResponseEntity.ok(cursoABuscar);
    }

    /* Modificamos un curso */
    @PutMapping("/{id}")
    public ResponseEntity<Cursos> modificarCurso(@PathVariable Long id, @RequestBody Cursos curso) {
        Cursos cursoAModificar = cursosService.buscarCursoPorId(id);

        if(cursoAModificar == null){ return ResponseEntity.notFound().build(); }

        cursoAModificar.setNombre(curso.getNombre());
        return ResponseEntity.ok(cursosService.modificarCurso(cursoAModificar));
    }
    /* Eliminamos un curso */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCurso(@PathVariable Long id){
        cursosService.eliminarCurso(id);
        return ResponseEntity.ok().build();
    }

}
