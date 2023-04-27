package org.pwc_desafio.service;

import org.pwc_desafio.model.Estudiantes;
import org.pwc_desafio.repositories.CursosRepository;
import org.pwc_desafio.repositories.EstudiantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiantesService {

    private final EstudiantesRepository estudiantesRepository;

    @Autowired
    EstudiantesService(EstudiantesRepository estudiantesRepository) {
        this.estudiantesRepository = estudiantesRepository;
    }

    @Autowired
    CursosRepository cursosRepository;

    //---------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    /* Matricular un estudiante en un curso */
    public Estudiantes matricularEstudiantes(Long id, Long idCurso) {
        Estudiantes estudiantes = estudiantesRepository.findById(id).orElse(null);
        assert estudiantes != null;
        estudiantes.setCursoMatriculado(cursosRepository.findById(idCurso).orElse(null));
        estudiantesRepository.save(estudiantes);

        return estudiantes;
    }
    //----------------------------------------------------------------------------------------------------
    // Adicional
    public void crearEstudiantes(Estudiantes estudiantes) {
        estudiantesRepository.save(estudiantes);
    }

    public Estudiantes buscarEstudiantesPorId(Long id) {
        return estudiantesRepository.findById(id).orElse(null);
    }

    public void eliminarEstudiantes(Long id) {
        estudiantesRepository.deleteById(id);
    }

    public Estudiantes desmatricularEstudiantes(Long id) {
        Estudiantes estudiantes = estudiantesRepository.findById(id).orElse(null);
        assert estudiantes != null;
        estudiantes.setCursoMatriculado(null);
        estudiantesRepository.save(estudiantes);

        return estudiantes;
    }
}