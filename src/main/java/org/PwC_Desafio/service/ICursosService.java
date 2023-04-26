package org.PwC_Desafio.service;

import org.PwC_Desafio.model.Cursos;
import org.PwC_Desafio.model.Estudiantes;

import java.util.List;

public interface ICursosService {

    /* Registramos un curso */
    Cursos registrarCurso(Cursos curso);

    /* Buscamos un curso por su id */
    Cursos buscarCursoPorId(Long idCurso);

    /* Modificamos un curso */
    Cursos modificarCurso(Cursos curso);

    /* Eliminamos un curso por su id */
    void eliminarCurso(Long idCurso);

    /* Listamos a todos los estudiantes en un curso específico */
    List<Estudiantes> listarEstudiantesPorCurso(Long idCurso);
}
