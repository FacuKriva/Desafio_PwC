package org.desafio_pwc.service;

import org.desafio_pwc.model.Cursos;
import org.desafio_pwc.model.Estudiantes;
import org.desafio_pwc.repositories.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursosService {

    private final CursosRepository cursosRepository;

    @Autowired
    CursosService(CursosRepository cursosRepository) {
        this.cursosRepository = cursosRepository;
    }

    // --------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    /* Listar a todos los estudiantes que pertenecen a un curso. */
    public List<Estudiantes> listarEstudiantesPorCurso(Long idCurso) {
        return cursosRepository.listarEstudiantesPorCurso(idCurso);
    }
    // --------------------------------------------------------------------------------------------------
    //Adicional
    public Cursos registrarCurso(Cursos curso) { return cursosRepository.save(curso); }

    public Cursos buscarCursoPorId(Long idCurso) { return cursosRepository.findById(idCurso).orElse(null); }

    public Cursos modificarCurso(Cursos curso) { return cursosRepository.save(curso); }

    public void eliminarCurso(Long idCurso) { cursosRepository.deleteById(idCurso); }
}