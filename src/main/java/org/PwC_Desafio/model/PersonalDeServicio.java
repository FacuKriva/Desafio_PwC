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
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "personalDeServicio")
public class PersonalDeServicio extends Empleados{

    @ManyToOne(fetch = FetchType.LAZY)
    private Seccion seccionAsignada;
}
