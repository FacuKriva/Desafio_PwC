package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.PersonalDeServicio;
import org.PwC_Desafio.service.IPersonalDeServicioService;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PersonalDeServicioServiceTest {

    @Autowired
    private IPersonalDeServicioService personalDeServicioService;

    @Test
    @Order(1)
    public void crearPersonalDeServicio() {
        PersonalDeServicio personalDeServicio = new PersonalDeServicio();
        personalDeServicio.setNombre("Sebastian");
        personalDeServicio.setApellido("Fernández");
        personalDeServicio.setDni("36.385.678");
        personalDeServicio.setEstadoCivil("Casado");
        personalDeServicio.setAnioDeIncorporacion("2017");
        personalDeServicio.setNumeroDeDespachoAsignado("S-1");
        personalDeServicio.setSeccionAsignada(null);

        PersonalDeServicio personalDeServicio2 = new PersonalDeServicio();
        personalDeServicio2.setNombre("Javier");
        personalDeServicio2.setApellido("Hernández");
        personalDeServicio2.setDni("26.835.678");
        personalDeServicio2.setEstadoCivil("Soltero");
        personalDeServicio2.setAnioDeIncorporacion("2011");
        personalDeServicio2.setNumeroDeDespachoAsignado("B-2");
        personalDeServicio2.setSeccionAsignada(null);

        PersonalDeServicio personalDeServicio3 = new PersonalDeServicio();
        personalDeServicio3.setNombre("Jorge");
        personalDeServicio3.setApellido("González");
        personalDeServicio3.setDni("16.835.678");
        personalDeServicio3.setEstadoCivil("Viudo");
        personalDeServicio3.setAnioDeIncorporacion("1999");
        personalDeServicio3.setNumeroDeDespachoAsignado("B-2");
        personalDeServicio3.setSeccionAsignada(null);

        PersonalDeServicio personalDeServicio4 = new PersonalDeServicio();
        personalDeServicio4.setNombre("Jorge");
        personalDeServicio4.setApellido("González");
        personalDeServicio4.setDni("16.835.678");
        personalDeServicio4.setEstadoCivil("Viudo");
        personalDeServicio4.setAnioDeIncorporacion("1999");
        personalDeServicio4.setNumeroDeDespachoAsignado("B-2");
        personalDeServicio4.setSeccionAsignada(null);
    }

    @Test
    @Order(2)
    public void asignarSeccion() {
        PersonalDeServicio personalDeServicio = personalDeServicioService.asignarSeccion(1L, 10L);
        PersonalDeServicio personalDeServicio2 = personalDeServicioService.asignarSeccion(2L, 11L);
        PersonalDeServicio personalDeServicio3 = personalDeServicioService.asignarSeccion(3L, 12L);
        PersonalDeServicio personalDeServicio4 = personalDeServicioService.asignarSeccion(4L, 12L);
    }

    @Test
    @Order(3)
    public void cambiarSeccion() {
        PersonalDeServicio personalDeServicio = personalDeServicioService.cambiarSeccion(3L, 11L);
    }

}
