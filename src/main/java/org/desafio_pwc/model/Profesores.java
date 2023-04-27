package org.desafio_pwc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "profesores")
@PrimaryKeyJoinColumn(name = "person_id")
public class Profesores extends Empleados {

    @ManyToOne(fetch = FetchType.EAGER)
    private Departamentos departamentoAsignado;
}
