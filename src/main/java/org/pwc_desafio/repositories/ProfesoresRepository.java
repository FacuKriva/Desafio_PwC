package org.pwc_desafio.repositories;

import org.pwc_desafio.model.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesoresRepository extends JpaRepository<Profesores, Long> {
}
