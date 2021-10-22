package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class Notas {

    @Builder.Default
    @EmbeddedId
    private NotasPK id = new NotasPK();

    @ManyToOne
    @MapsId("asignatura_id")
    @JoinColumn(name="asignatura_id")
    private Asignatura asignatura;

    @ManyToOne
    @MapsId("alumno_id")
    @JoinColumn(name="alumno_id")
    private Alumno alumno;

    private int primeraEv;
    private int segundaEv;
    private int terceraEv;

    //HELPERS

    public void addToAlumno(Alumno a){
        alumno = a;
        a.getNotas().add(this);
    }

    public void removeFromAlumno(Alumno a) {
        a.getNotas().remove(this);
        alumno=null;
    }

    public void addToAsignatura(Asignatura a){
        asignatura = a;
        a.getNotas()
    }

}
