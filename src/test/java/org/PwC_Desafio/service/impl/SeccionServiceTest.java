package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.Seccion;
import org.PwC_Desafio.service.ISeccionService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SeccionServiceTest {

    @Autowired
    private ISeccionService seccionService;

    @Test
    @Order(1)
    public void crearSeccion() {
        Seccion seccion = new Seccion();
        seccion.setId(10L);
        seccion.setNombreSeccion("Biblioteca");

        Seccion seccion2 = new Seccion();
        seccion2.setId(11L);
        seccion2.setNombreSeccion("Decanato");

        Seccion seccion3 = new Seccion();
        seccion3.setId(12L);
        seccion3.setNombreSeccion("Secretaria");
    }

}
