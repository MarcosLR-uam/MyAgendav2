package org.example.MyAgendaV3.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import javax.persistence.*;

@Entity
@Getter @Setter
@View(members =
        "tarea;" +
                "prioridad;"
)
public class PrioridadTarea extends BaseEntity {

    @ManyToOne(optional = false)
    @DescriptionsList(descriptionProperties = "titulo")
    private Tarea tarea;

    @Required
    @Stereotype("PRIORIDAD")
    @Column(length = 10)
    private String prioridad; // ALTA, MEDIA, BAJA
}