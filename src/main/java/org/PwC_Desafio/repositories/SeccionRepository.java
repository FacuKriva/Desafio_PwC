package org.PwC_Desafio.repositories;

import org.PwC_Desafio.model.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeccionRepository extends JpaRepository<Seccion, Long> {
}
