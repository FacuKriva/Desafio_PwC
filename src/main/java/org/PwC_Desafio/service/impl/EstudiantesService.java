package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.Estudiantes;
import org.PwC_Desafio.repositories.CursosRepository;
import org.PwC_Desafio.repositories.EstudiantesRepository;
import org.PwC_Desafio.service.IEstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiantesService implements IEstudiantesService {

    @Autowired
    EstudiantesRepository estudiantesRepository;
    @Autowired
    private CursosRepository cursosRepository;

    //---------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    @Override
    /* Matriculamos un estudiante en un curso */
    public Estudiantes matricularEstudiantes(Long id, Long idCurso) {
        Estudiantes estudiantes = estudiantesRepository.findById(id).get();
        estudiantes.setCursoMatriculado(cursosRepository.findById(idCurso).get());
        estudiantesRepository.save(estudiantes);

        return estudiantes;
    }
//----------------------------------------------------------------------------------------------------
    // Adicional
    @Override
    public Estudiantes crearEstudiantes(Estudiantes estudiantes) {
        estudiantesRepository.save(estudiantes);

        return estudiantes;
    }

    @Override
    public Estudiantes buscarEstudiantesPorId(Long id) {
        return estudiantesRepository.findById(id).get();
    }

    @Override
    public void eliminarEstudiantes(Long id) {
        estudiantesRepository.deleteById(id);
    }

    @Override
    public Estudiantes desmatricularEstudiantes(Long id) {
        Estudiantes estudiantes = estudiantesRepository.findById(id).get();
        estudiantes.setCursoMatriculado(null);
        estudiantesRepository.save(estudiantes);

        return estudiantes;
    }
}
