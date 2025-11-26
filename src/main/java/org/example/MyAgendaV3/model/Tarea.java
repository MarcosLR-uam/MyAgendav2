package org.example.MyAgendaV3.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import org.openxava.calculators.CurrentLocalDateCalculator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Tarea extends BaseEntity {

    @Required
    @Column(length = 250)
    private String titulo;

    @Column(length = 250)
    private String descripcion;


    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    @ReadOnly
    private LocalDate fechaCreacion;


    private LocalDate fechaLimite;

    @ManyToOne(optional = false)
    @ReferenceView("simple")
    private Usuario usuario;


    @ManyToOne(optional = false)
    private Categoria categoria;


    @Enumerated(EnumType.STRING)
    private EstadoTarea estado;
}
