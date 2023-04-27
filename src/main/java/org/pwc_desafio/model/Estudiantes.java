package org.pwc_desafio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "estudiantes")
@PrimaryKeyJoinColumn(name = "person_id")
public class Estudiantes extends Persona {

    @ManyToOne(fetch = FetchType.EAGER)
    private Cursos cursoMatriculado;
}