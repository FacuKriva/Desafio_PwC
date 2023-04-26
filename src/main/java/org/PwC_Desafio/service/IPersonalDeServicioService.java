package org.PwC_Desafio.service;

import org.PwC_Desafio.model.PersonalDeServicio;
import org.PwC_Desafio.model.Seccion;

public interface IPersonalDeServicioService {
    //---------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    /**
     * Transladar de sección a uno de personal de servicio.
     * @param id id del personal de servicio.
     */
    PersonalDeServicio cambiarSeccion(Long id, Seccion seccionAsignada);
    //----------------------------------------------------------------------------------------------------
    // Adicional

    /* Creamos un empleado de servicio */
    PersonalDeServicio crearPersonalDeServicio(PersonalDeServicio personalDeServicio);

    /* Obtenemos un empleado de servicio por su id */
    PersonalDeServicio buscarPersonalDeServicioPorId(Long id);

    /* Eliminamos un empleado de servicio por su id */
    void eliminarPersonalDeServicio(Long id);
}
