package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.Cursos;
import org.PwC_Desafio.model.Estudiantes;
import org.PwC_Desafio.repositories.CursosRepository;
import org.PwC_Desafio.service.ICursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursosService implements ICursosService {

    @Autowired
    CursosRepository cursosRepository;

    // --------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    @Override
    public List<Estudiantes> listarEstudiantesPorCurso(Long idCurso) {
        return cursosRepository.listarEstudiantesPorCurso(idCurso);
    }
    // --------------------------------------------------------------------------------------------------

    //Adicional
    @Override
    public Cursos registrarCurso(Cursos curso) {
        return cursosRepository.save(curso);
    }

    @Override
    public Cursos buscarCursoPorId(Long idCurso) {
        return cursosRepository.findById(idCurso).get();
    }

    @Override
    public Cursos modificarCurso(Cursos curso) {
        return cursosRepository.save(curso);
    }

    @Override
    public void eliminarCurso(Long idCurso) {
        cursosRepository.deleteById(idCurso);
    }
}
