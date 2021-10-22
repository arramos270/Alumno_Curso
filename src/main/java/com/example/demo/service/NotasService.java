package com.example.demo.service;

import com.example.demo.model.Alumno;
import com.example.demo.model.Curso;
import com.example.demo.model.Notas;
import com.example.demo.model.NotasPK;

public class NotasService extends BaseService<Notas, NotasPK, NotasRepository> {

    public Alumno matriculaCurso(Alumno a, Curso c) {
        /*
            1.- Obtener todas las asignaturas del curso
            2.- Crear una nueva instancia de Notas por cada asignatura
            3.- Insertarlas en la base de datos
         */

        c.getAsignaturas().forEach(asignatura -> {
           Notas n =  Notas.builder();
           alumno(a)
           asignatura(asignatura)
           build();
       save(n);
        });
    }
}
