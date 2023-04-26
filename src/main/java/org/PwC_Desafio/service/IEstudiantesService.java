package org.PwC_Desafio.service;

import org.PwC_Desafio.model.Estudiantes;

public interface IEstudiantesService {
    //---------------------------------------------------------------------------------------------------
        // TODO: Parte del requerimiento del desafío.
    /**
     * Matricular un estudiante
     * @param id id del estudiante
     * @param idCurso id del curso a matricular
     * @return estudiante matriculado en el curso nombreCurso(idCurso)
     */
    Estudiantes matricularEstudiantes(Long id, Long idCurso);

    //----------------------------------------------------------------------------------------------------
    // Adicional

    /*Creamos un estudiante*/
    Estudiantes crearEstudiantes(Estudiantes estudiantes);

    /*Obtenemos un estudiante por su id*/
    Estudiantes buscarEstudiantesPorId(Long id);

    /*Eliminamos un estudiante por su id*/
    void eliminarEstudiantes(Long id);

    /* Desmatriculamos a un estudiante que se encuentra matriculado en un curso */
    Estudiantes desmatricularEstudiantes(Long id);
}
