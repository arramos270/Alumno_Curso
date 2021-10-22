package com.example.demo.repos;

import com.example.demo.model.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignaturaRepository
        extends JpaRepository<Asignatura, Long> {
}
