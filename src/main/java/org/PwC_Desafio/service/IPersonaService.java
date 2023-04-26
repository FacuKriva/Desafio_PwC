package org.PwC_Desafio.service;

import org.PwC_Desafio.model.Persona;

public interface IPersonaService {
    /* Modificar el estadoCivil de una persona */
    Persona modificarPersonaEstadoCivil(Long id, String estadoCivil);
}
