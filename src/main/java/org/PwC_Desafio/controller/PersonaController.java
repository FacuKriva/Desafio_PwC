package org.PwC_Desafio.controller;

import org.PwC_Desafio.model.Persona;
import org.PwC_Desafio.service.impl.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    private PersonaService personaService;

    @Autowired
    public void setService(PersonaService personaService) { this.personaService = personaService; }

    //---------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    @PutMapping("/{id}")
    public ResponseEntity<Persona> modificarPersonaEstadoCivil(@PathVariable Long id, @RequestParam String estadoCivil) {
        return ResponseEntity.ok(personaService.modificarPersonaEstadoCivil(id, estadoCivil));
    }
    //----------------------------------------------------------------------------------------------------
    // Adicional

    @PostMapping
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona) {
        return ResponseEntity.ok(personaService.crearPersona(persona));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> buscarPersona(@PathVariable Long id){
        Persona personaABuscar = personaService.buscarPersonaPorId(id);

        if(personaABuscar == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(personaABuscar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
        return ResponseEntity.ok().build();
    }
}