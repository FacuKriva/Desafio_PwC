package org.PwC_Desafio.repositories;

import org.PwC_Desafio.model.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiantesRepository extends JpaRepository<Estudiantes, Long> {
}
