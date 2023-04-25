package org.PwC_Desafio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "empleados")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Empleados extends Persona {

        private String anioDeIncorporacion;
        private String numeroDeDespachoAsignado;
}
