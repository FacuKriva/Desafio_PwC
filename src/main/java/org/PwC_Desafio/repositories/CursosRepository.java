package org.PwC_Desafio.repositories;

import org.PwC_Desafio.model.Cursos;
import org.PwC_Desafio.model.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Long> {
    List<Estudiantes> listarEstudiantesPorCurso(Long idCurso);
}
