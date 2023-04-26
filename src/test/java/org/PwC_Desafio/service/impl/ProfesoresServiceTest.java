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

        Profesores profesores2 = new Profesores();
        profesores2.setNombre("John");
        profesores2.setApellido("Doe");
        profesores2.setDni("99.345.678");
        profesores2.setEstadoCivil("Casado");
        profesores2.setDepartamentoAsignado(null);

        Profesores profesores3 = new Profesores();
        profesores3.setNombre("Jane");
        profesores3.setApellido("Doe");
        profesores3.setDni("99.543.897");
        profesores3.setEstadoCivil("Casada");
        profesores3.setDepartamentoAsignado(null);

        Profesores profesores4 = new Profesores();
        profesores4.setNombre("Joaquin");
        profesores4.setApellido("Saviola");
        profesores4.setDni("28.478.625");
        profesores4.setEstadoCivil("Soltero");
        profesores4.setDepartamentoAsignado(null);

    }

    @Test
    @Order(2)
    public void asignarDepartamento() {
        Profesores profesores = profesoresService.asignarDepartamento(1L, 300L);
        Profesores profesores2 = profesoresService.asignarDepartamento(2L, 200L);
        Profesores profesores3 = profesoresService.asignarDepartamento(3L, 300L);
        Profesores profesores4 = profesoresService.asignarDepartamento(4L, 100L);
    }

    //-----------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafio
    @Test
    @Order(3)
    public void cambiarDepartamento() {
        Profesores profesores = profesoresService.cambiarDepartamento(1L, 100L);
    }
    //-----------------------------------------------------------------------------------------------

}
