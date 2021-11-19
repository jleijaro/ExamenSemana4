package com.example.ExamenSemana4.repository;

import com.example.ExamenSemana4.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlumnoRepository {

    @Autowired
    AlumnoRepositoryDao alumnoRepositoryDao;

    public void creacionAlumno(Alumno alumno) {
        alumnoRepositoryDao.save(alumno);
    }
}
