package org.example.MyAgendaV3.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.View;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
@View(members=
        "nombre;" +
                "descripcion;"
)

@Getter
@Setter
public class Categoria extends BaseEntity {

    @Column(length = 50)
    private String nombre;

    @Column(length = 250)
    private String descripcion;
}
