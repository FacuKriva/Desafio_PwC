package org.desafio_pwc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "empleados")
@PrimaryKeyJoinColumn(name = "person_id")
@Inheritance(strategy = InheritanceType.JOINED)
public class Empleados extends Persona {

        private String anioDeIncorporacion;
        private String numeroDeDespachoAsignado;
}
