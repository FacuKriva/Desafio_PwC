package org.pwc_desafio.repositories;

import org.pwc_desafio.model.Cursos;
import org.pwc_desafio.model.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Long> {
    List<Estudiantes> listarEstudiantesPorCurso(Long idCurso);
}
