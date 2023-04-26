package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.Profesores;
import org.PwC_Desafio.service.IProfesoresService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProfesoresServiceTest {

    @Autowired
    private IProfesoresService profesoresService;

    @Test
    @Order(1)
    public void crearProfesores() {
        Profesores profesores = new Profesores();
        profesores.setNombre("Fernando");
        profesores.setApellido("González");
        profesores.setDni("12.345.678");
        profesores.setEstadoCivil("Casado");
        profesores.setDepartamentoAsignado(null);
    }

    @Test
    @Order(2)
    public void asignarDepartamento() {
        Profesores profesores = profesoresService.asignarDepartamento(1L, 11L);
    }

    //-----------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafio
    @Test
    @Order(3)
    public void cambiarDepartamento() {
        Profesores profesores = profesoresService.cambiarDepartamento(1L, 22L);
    }
    //-----------------------------------------------------------------------------------------------

}
