package org.PwC_Desafio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "personalDeServicio")
public class PersonalDeServicio extends Empleados{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seccion_asignada_id")
    private Seccion seccionAsignada;
}
