package org.pwc_desafio.repositories;

import org.pwc_desafio.model.PersonalDeServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDeServicioRepository extends JpaRepository<PersonalDeServicio, Long> {
}
