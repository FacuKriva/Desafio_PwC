package org.desafio_pwc.repositories;

import org.desafio_pwc.model.PersonalDeServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDeServicioRepository extends JpaRepository<PersonalDeServicio, Long> {
}
