package com.example.demo.service;

import com.example.demo.model.Alumno;
import com.example.demo.repos.AlumnoRepository;
import com.example.demo.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService
        extends BaseService<Alumno, Long, AlumnoRepository> {


}
