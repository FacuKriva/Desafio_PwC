package org.PwC_Desafio.repositories;

import org.PwC_Desafio.model.Departamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamentos, Long> {
}
