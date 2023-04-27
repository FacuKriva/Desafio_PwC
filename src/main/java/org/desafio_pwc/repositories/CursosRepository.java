package org.desafio_pwc.repositories;

import org.desafio_pwc.model.Cursos;
import org.desafio_pwc.model.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Long> {
    List<Estudiantes> listarEstudiantesPorCurso(Long idCurso);
}
