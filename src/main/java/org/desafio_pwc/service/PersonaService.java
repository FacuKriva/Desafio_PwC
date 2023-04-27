package org.desafio_pwc.service;

import org.desafio_pwc.model.Persona;
import org.desafio_pwc.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    @Autowired
    PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    //---------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    /* Modificamos el estado civil de una persona. */
    public Persona modificarPersonaEstadoCivil(Long id, String estadoCivil) {
        Persona persona = personaRepository.findById(id).orElse(null);
        assert persona != null;
        persona.setEstadoCivil(estadoCivil);
        personaRepository.save(persona);

        return persona;
    }
}