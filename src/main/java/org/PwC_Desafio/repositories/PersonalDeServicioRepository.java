package org.PwC_Desafio.repositories;

import org.PwC_Desafio.model.PersonalDeServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDeServicioRepository extends JpaRepository<PersonalDeServicio, Long> {
}
