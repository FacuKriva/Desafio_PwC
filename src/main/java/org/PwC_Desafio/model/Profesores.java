package org.PwC_Desafio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "profesores")
public class Profesores extends Empleados {
    private Departamentos departamentoAsignado;
}
