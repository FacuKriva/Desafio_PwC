package org.desafio_pwc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "personal-de-servicio")
@PrimaryKeyJoinColumn(name = "person_id")
public class PersonalDeServicio extends Empleados{

    @ManyToOne(fetch = FetchType.EAGER)
    private Seccion seccionAsignada;
}
