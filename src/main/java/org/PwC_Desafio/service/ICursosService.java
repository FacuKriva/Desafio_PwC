package org.PwC_Desafio.service;

import org.PwC_Desafio.model.Cursos;
import org.PwC_Desafio.model.Estudiantes;

import java.util.List;
import java.util.Set;

public interface ICursosService {

    /* Registramos, modificamos y eliminamos un curso */
    Cursos registrarCurso(Cursos curso);
    Cursos modificarCurso(Cursos curso);
    void eliminarCurso(Long idCurso);

    /* Listamos a todos los estudiantes en un curso específico */
    List<Estudiantes> listarEstudiantesPorCurso(Long idCurso);
}
