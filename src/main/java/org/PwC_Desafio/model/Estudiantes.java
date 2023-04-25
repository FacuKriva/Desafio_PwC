package org.PwC_Desafio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "estudiantes")
public class Estudiantes extends Persona {

    @ManyToOne(fetch = FetchType.LAZY)
    private Cursos cursoMatriculado;
}
