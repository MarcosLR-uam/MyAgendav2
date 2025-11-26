package org.example.MyAgendaV3.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.View;
import javax.persistence.Entity;
import javax.persistence.Column;

@View(name="simple", members="nombre, apellido")
@Entity
@Getter @Setter
public class Usuario extends BaseEntity {

    @Column(length=50)
    private String nombre;

    @Column(length=50)
    private String apellido;

}