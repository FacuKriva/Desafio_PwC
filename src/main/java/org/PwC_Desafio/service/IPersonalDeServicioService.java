package org.PwC_Desafio.service;

import org.PwC_Desafio.model.PersonalDeServicio;

public interface IPersonalDeServicioService {
    //---------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    /**
     * Transladar de sección a uno de personal de servicio.
     * @param id id del personal de servicio.
     */
    PersonalDeServicio cambiarSeccion(Long id, long seccionAsignada);
    //----------------------------------------------------------------------------------------------------
    // Adicional

    /* Creamos un empleado de servicio */
    PersonalDeServicio crearPersonalDeServicio(PersonalDeServicio personalDeServicio);

    /* Obtenemos un empleado de servicio por su id */
    PersonalDeServicio buscarPersonalDeServicioPorId(Long id);

    /* Eliminamos un empleado de servicio por su id */
    void eliminarPersonalDeServicio(Long id);

    /* Le asignamos una sección a un empleado de servicio */
    PersonalDeServicio asignarSeccion(Long id, long seccionAsignada);
}
