package org.pwc_desafio.repositories;

import org.pwc_desafio.model.Departamentos;
import org.pwc_desafio.model.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentosRepository extends JpaRepository<Departamentos, Long> {
    List<Profesores> listarProfesoresPorDepartamento(Long idDepartamento);
}
