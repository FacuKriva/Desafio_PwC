package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.Departamentos;
import org.PwC_Desafio.model.Profesores;
import org.PwC_Desafio.repositories.DepartamentosRepository;
import org.PwC_Desafio.repositories.ProfesoresRepository;
import org.PwC_Desafio.service.IProfesoresService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProfesoresService implements IProfesoresService{

    @Autowired
    ProfesoresRepository profesoresRepository;

    // -------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    @Override
    public Profesores cambiarDepartamento(Long id, Long idDepartamento) {
        Profesores profesor = profesoresRepository.findById(id).get();
        Departamentos departamento = new Departamentos();
        departamento.setId(idDepartamento);
        profesor.setDepartamentoAsignado(departamento);
        profesoresRepository.save(profesor);
        return profesor;
    }
    // -------------------------------------------------------------------------------------------
    // Adicional

    @Override
    public Profesores crearProfesores(Profesores profesores) {
        profesoresRepository.save(profesores);
        return profesores;
    }

    @Override
    public Profesores buscarProfesoresPorId(Long id) {
        return profesoresRepository.findById(id).get();
    }

    @Override
    public void eliminarProfesores(Long id) {
        profesoresRepository.deleteById(id);
    }

}