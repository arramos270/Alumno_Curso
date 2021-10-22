package com.example.demo.repos;

import com.example.demo.model.Alumno;
import com.example.demo.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlumnoRepository
        extends JpaRepository<Alumno, Long> {

    List<Alumno> findByCurso(Curso curso);
}
