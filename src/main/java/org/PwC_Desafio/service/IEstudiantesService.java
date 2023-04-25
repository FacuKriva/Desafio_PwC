package org.PwC_Desafio.service;

import org.PwC_Desafio.model.Estudiantes;

public interface IEstudiantesService extends IPersonaService{

    /*Creamos un estudiante*/
    Estudiantes crearEstudiante(Estudiantes estudiante);

    /*Obtenemos un estudiante por su id*/
    Estudiantes buscarEstudiantePorId(Long id);

    /*Eliminamos un estudiante por su id*/
    void eliminarEstudiante(Long id);


    /**
     * Matricular un estudiante
     * @param id id del estudiante
     * @param idCurso id del curso a matricular
     * @return estudiante matriculado en el curso nombreCurso(idCurso)
     */
    String matricularEstudiante(Long id, Long idCurso);

    /* Desmatriculamos a un estudiante que se encuentra matriculado en un curso */
    String desmatricularEstudiante(Long id, Long idCurso);

}
