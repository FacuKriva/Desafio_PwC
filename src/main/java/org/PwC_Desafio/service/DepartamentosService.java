package org.pwc_desafio.service;

import org.pwc_desafio.model.Departamentos;
import org.pwc_desafio.model.Profesores;
import org.pwc_desafio.repositories.DepartamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartamentosService {

    private final DepartamentosRepository departamentosRepository;

    @Autowired
    DepartamentosService(DepartamentosRepository departamentosRepository) {
        this.departamentosRepository = departamentosRepository;
    }

    // --------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío.
    /* Listar a todos los profesores que pertenecen a un departamento. */
    public List<Profesores> listarProfesoresPorDepartamento(Long idDepartamento) {
        return departamentosRepository.listarProfesoresPorDepartamento(idDepartamento);
    }
    // --------------------------------------------------------------------------------------------------
    //Adicional
    public Departamentos registrarDepartamento(Departamentos departamento) {
        return departamentosRepository.save(departamento);
    }

    public Departamentos buscarDepartamentoPorId(Long idDepartamento) {
        return departamentosRepository.findById(idDepartamento).orElse(null);
    }

    public Departamentos modificarDepartamento(Departamentos departamento) {
        return departamentosRepository.save(departamento);
    }

    public void eliminarDepartamento(Long idDepartamento) {
        departamentosRepository.deleteById(idDepartamento);
    }
}