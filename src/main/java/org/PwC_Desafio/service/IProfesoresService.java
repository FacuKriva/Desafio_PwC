package org.PwC_Desafio.service;

import org.PwC_Desafio.model.Profesores;

public interface IProfesoresService {
    //---------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    /**
     * Cambiar de departamento a un profesor.
     * @param id id del profesor
     * @param idDepartamento id del departamento al que se va a cambiar
     */
    Profesores cambiarDepartamento(Long id, Long idDepartamento);

    //----------------------------------------------------------------------------------------------------

    /* Creamos un profesor */
    Profesores crearProfesores(Profesores profesores);

    /* Obtenemos un profesor por su id */
    Profesores buscarProfesoresPorId(Long id);

    /* Eliminamos un profesor por su id */
    void eliminarProfesores(Long id);
}

