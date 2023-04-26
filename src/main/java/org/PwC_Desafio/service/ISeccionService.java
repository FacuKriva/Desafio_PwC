package org.PwC_Desafio.service;

import org.PwC_Desafio.model.Seccion;

public interface ISeccionService {

    Seccion registrarSeccion(Seccion seccion);

    Seccion buscarSeccionPorId(Long idSeccion);

    Seccion modificarSeccion(Seccion seccion);

    void eliminarSeccion(Long idSeccion);
}
