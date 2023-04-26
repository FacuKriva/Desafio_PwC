package org.PwC_Desafio.controller;

import org.PwC_Desafio.model.PersonalDeServicio;
import org.PwC_Desafio.service.impl.PersonalDeServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/personalDeServicio")
public class PersonalDeServicioController {

    @Autowired
    private PersonalDeServicioService personalDeServicioService;

    //---------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    /* Cambiamos la sección de un empleado de servicio */
    @PostMapping("/{id}")
    public ResponseEntity<PersonalDeServicio> cambiarSeccion(@RequestBody Long id, String seccionAsignada) {
        return ResponseEntity.ok(personalDeServicioService.cambiarSeccion(id, seccionAsignada));
    }

    //----------------------------------------------------------------------------------------------------
    // Adicional

    /* Creamos un empleado de servicio */
    @PostMapping
    public ResponseEntity<PersonalDeServicio> crearPersonalDeServicio(@RequestBody PersonalDeServicio personalDeServicio) {
        return ResponseEntity.ok(personalDeServicioService.crearPersonalDeServicio(personalDeServicio));
    }

    /* Buscamos a un empleado de servicio por su id */
    @PostMapping("/{id}")
    public ResponseEntity<PersonalDeServicio> buscarPersonalDeServicioPorId(@RequestBody Long id) {
        return ResponseEntity.ok(personalDeServicioService.buscarPersonalDeServicioPorId(id));
    }

    /* Eliminamos a un empleado de servicio */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPersonalDeServicio(@RequestBody Long id) {
        personalDeServicioService.eliminarPersonalDeServicio(id);
        return ResponseEntity.ok().build();
    }
}
