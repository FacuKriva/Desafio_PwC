package org.PwC_Desafio.repositories;

import org.PwC_Desafio.model.Departamentos;
import org.PwC_Desafio.model.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentosRepository extends JpaRepository<Departamentos, Long> {
    List<Profesores> listarProfesoresPorDepartamento(Long idDepartamento);
}
