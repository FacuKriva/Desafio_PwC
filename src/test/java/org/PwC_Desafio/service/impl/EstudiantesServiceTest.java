package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.Estudiantes;
import org.PwC_Desafio.service.IEstudiantesService;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EstudiantesServiceTest {

    @Autowired
    private IEstudiantesService estudiantesService;

    @Test
    @Order(1)
    public void crearEstudiantes() {
        Estudiantes estudiantes = new Estudiantes();
        estudiantes.setNombre("Juan");
        estudiantes.setApellido("Perez");
        estudiantes.setDni("46.345.678");
        estudiantes.setEstadoCivil("Soltero");
        estudiantes.setCursoMatriculado(null);

        Estudiantes estudiantes2 = new Estudiantes();
        estudiantes2.setNombre("Pedro");
        estudiantes2.setApellido("Gomez");
        estudiantes2.setDni("52.345.678");
        estudiantes2.setEstadoCivil("Soltero");
        estudiantes2.setCursoMatriculado(null);

        Estudiantes estudiantes3 = new Estudiantes();
        estudiantes3.setNombre("Maria");
        estudiantes3.setApellido("González");
        estudiantes3.setDni("28.345.678");
        estudiantes3.setEstadoCivil("Casada");
        estudiantes3.setCursoMatriculado(null);

        Estudiantes estudiantes4 = new Estudiantes();
        estudiantes4.setNombre("Ana");
        estudiantes4.setApellido("Pérez");
        estudiantes4.setDni("34.345.678");
        estudiantes4.setEstadoCivil("Soltera");
        estudiantes4.setCursoMatriculado(null);

        Estudiantes estudiantes5 = new Estudiantes();
        estudiantes5.setNombre("Fernando");
        estudiantes5.setApellido("Rodríguez");
        estudiantes5.setDni("19.308.678");
        estudiantes5.setEstadoCivil("Casado");
        estudiantes5.setCursoMatriculado(null);

    }

    //----------------------------------------------------------------------------------------------------
    // TODO: Prate del requerimiento del desafío
    @Test
    @Order(2)
    public void matricularEstudiantes() {
        Estudiantes estudiantes = estudiantesService.matricularEstudiantes(1L, 102L);
        Estudiantes estudiantes2 = estudiantesService.matricularEstudiantes(2L, 204L);
        Estudiantes estudiantes3 = estudiantesService.matricularEstudiantes(3L, 316L);
        Estudiantes estudiantes4 = estudiantesService.matricularEstudiantes(4L, 102L);
        Estudiantes estudiantes5 = estudiantesService.matricularEstudiantes(5L, 204L);
    }
    //---------------------------------------------------------------------------------------------------
}
