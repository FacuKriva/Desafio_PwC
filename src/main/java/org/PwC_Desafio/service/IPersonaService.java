package org.PwC_Desafio.service;

import org.PwC_Desafio.model.Persona;

public interface IPersonaService {
    /**
     * Crear Persona // Nueva Persona.
     *
     * @param persona persona a crear
     * @return persona creada
     */
    Persona crearPersona(Persona persona);

    /* Buscar Persona por Id */
    Persona buscarPersonaPorId(Long id);

    /* Eliminar persona */
    void eliminarPersona(Long id);

    /* Modificar el estadoCivil de una persona */
    Persona modificarPersonaEstadoCivil(Long id, String estadoCivil);
}
