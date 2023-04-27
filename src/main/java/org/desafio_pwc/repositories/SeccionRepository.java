package org.desafio_pwc.repositories;

import org.desafio_pwc.model.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeccionRepository extends JpaRepository<Seccion, Long> {
}
