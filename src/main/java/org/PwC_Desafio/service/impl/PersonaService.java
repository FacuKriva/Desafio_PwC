package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.Persona;
import org.PwC_Desafio.repositories.PersonaRepository;
import org.PwC_Desafio.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    PersonaRepository personaRepository;

    //---------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    @Override
    public Persona modificarPersonaEstadoCivil(Long id, String estadoCivil) {
        Persona persona = personaRepository.findById(id).get();
        persona.setEstadoCivil(estadoCivil);
        personaRepository.save(persona);

        return persona;
    }
}
    //----------------------------------------------------------------------------------------------------
