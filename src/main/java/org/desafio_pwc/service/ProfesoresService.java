package org.desafio_pwc.service;

import org.desafio_pwc.model.Departamentos;
import org.desafio_pwc.model.Profesores;
import org.desafio_pwc.repositories.ProfesoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesoresService {

    private final ProfesoresRepository profesoresRepository;

    @Autowired
    ProfesoresService(ProfesoresRepository profesoresRepository) {
        this.profesoresRepository = profesoresRepository;
    }

    // -------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    /* Cambiamos a un profesor de departamento */
    public Profesores cambiarDepartamento(Long id, Long idDepartamento) {
        Profesores profesor = profesoresRepository.findById(id).orElse(null);
        Departamentos departamento = new Departamentos();
        departamento.setId(idDepartamento);
        assert profesor != null;
        profesor.setDepartamentoAsignado(departamento);
        profesoresRepository.save(profesor);

        return profesor;
    }
    // -------------------------------------------------------------------------------------------
    // Adicional
    public Profesores crearProfesores(Profesores profesores) {
        profesoresRepository.save(profesores);
        return profesores;
    }

    public Profesores buscarProfesoresPorId(Long id) {
        return profesoresRepository.findById(id).orElse(null);
    }

    public void eliminarProfesores(Long id) {
        profesoresRepository.deleteById(id);
    }

    public Profesores asignarDepartamento(Long id, Long idDepartamento) {
        Profesores profesor = profesoresRepository.findById(id).orElse(null);
        Departamentos departamento = new Departamentos();
        assert profesor != null;
        departamento.setId(idDepartamento);
        profesor.setDepartamentoAsignado(departamento);
        profesoresRepository.save(profesor);
        return profesor;
    }
}