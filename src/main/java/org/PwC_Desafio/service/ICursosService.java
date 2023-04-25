package org.PwC_Desafio.service;

import org.PwC_Desafio.model.Cursos;

public interface ICursosService {

    /* Registramos, modificamos y eliminamos un curso */
    Cursos registrarCurso(Cursos curso);
    Cursos modificarCurso(Cursos curso);
    void eliminarCurso(Long idCurso);
}
