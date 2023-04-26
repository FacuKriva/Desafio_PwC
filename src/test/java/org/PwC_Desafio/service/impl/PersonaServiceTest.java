package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.Persona;
import org.PwC_Desafio.service.IEstudiantesService;
import org.PwC_Desafio.service.IPersonaService;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PersonaServiceTest {

    @Autowired
    private IPersonaService personaService;

    @Test
    @Order(1)
    public void modificarEstadoCivil() {
        Persona persona = personaService.modificarPersonaEstadoCivil(1L, "Casado");
    }
}
