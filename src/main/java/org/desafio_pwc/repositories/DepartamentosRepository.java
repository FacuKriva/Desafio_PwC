package org.desafio_pwc.repositories;

import org.desafio_pwc.model.Departamentos;
import org.desafio_pwc.model.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentosRepository extends JpaRepository<Departamentos, Long> {
    List<Profesores> listarProfesoresPorDepartamento(Long idDepartamento);
}
