package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.service.IDepartamentosService;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.PwC_Desafio.model.Departamentos;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DepartamentosServiceTest {

    @Autowired
    private IDepartamentosService departamentosService;

    @Test
    @Order(1)
    public void crearDepartamentos() {
        Departamentos departamentos = new Departamentos();
        departamentos.setId(100L);
        departamentos.setNombre("Matematica");

        Departamentos departamentos2 = new Departamentos();
        departamentos2.setId(200L);
        departamentos2.setNombre("Lengua");

        Departamentos departamentos3 = new Departamentos();
        departamentos3.setId(300L);
        departamentos3.setNombre("Arquitectura");
    }

    @Test
    @Order(2)
    public void listarProfesoresPorDepartamento() {
        Departamentos departamentos =
                (Departamentos) departamentosService.listarProfesoresPorDepartamento(100L);

        Departamentos departamentos2 =
                (Departamentos) departamentosService.listarProfesoresPorDepartamento(200L);

        Departamentos departamentos3 =
                (Departamentos) departamentosService.listarProfesoresPorDepartamento(300L);
    }
}
