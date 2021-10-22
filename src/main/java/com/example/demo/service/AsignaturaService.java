package com.example.demo.service;

import com.example.demo.model.Asignatura;
import com.example.demo.repos.AsignaturaRepository;
import com.example.demo.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaService
        extends BaseService<Asignatura, Long, AsignaturaRepository> {


   /*public List<Asignatura> saveAll(Iterable<Asignatura> list) {
       return this.repositorio.saveAll(list);
   }*/


}
