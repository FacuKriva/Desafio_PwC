package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.Cursos;
import org.PwC_Desafio.service.ICursosService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CursosServiceTest {

    @Autowired
    private ICursosService cursosService;

    @Test
    @Order(1)
    public void crearCursos() {
        Cursos cursos = new Cursos();
        cursos.setId(102L);
        cursos.setNombre("Física I");

        Cursos cursos2 = new Cursos();
        cursos2.setId(204L);
        cursos2.setNombre("Literatura II");

        Cursos cursos3 = new Cursos();
        cursos3.setId(316L);
        cursos3.setNombre("Estructuras III");
    }

    // ---------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafio
    @Test
    @Order(2)
    public void listarEstudiantesPorCurso() {
        Cursos cursos = (Cursos) cursosService.listarEstudiantesPorCurso(102L);
        Cursos cursos2 = (Cursos) cursosService.listarEstudiantesPorCurso(204L);
        Cursos cursos3 = (Cursos) cursosService.listarEstudiantesPorCurso(316L);
    }
    // ---------------------------------------------------------------------------------------------
}
