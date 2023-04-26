package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.Departamentos;
import org.PwC_Desafio.model.Profesores;
import org.PwC_Desafio.repositories.DepartamentosRepository;
import org.PwC_Desafio.service.IDepartamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentosService implements IDepartamentosService {

    @Autowired
    DepartamentosRepository departamentosRepository;

    @Override
    public Departamentos registrarDepartamento(Departamentos departamento) {
        return departamentosRepository.save(departamento);
    }

    @Override
    public Departamentos buscarDepartamentoPorId(Long idDepartamento) {
        return departamentosRepository.findById(idDepartamento).get();
    }

    @Override
    public Departamentos modificarDepartamento(Departamentos departamento) {
        return departamentosRepository.save(departamento);
    }

    @Override
    public void eliminarDepartamento(Long idDepartamento) {
        departamentosRepository.deleteById(idDepartamento);
    }

    @Override
    public List<Profesores> listarProfesoresPorDepartamento(Long idDepartamento) {
        return departamentosRepository.listarProfesoresPorDepartamento(idDepartamento);
    }

}
