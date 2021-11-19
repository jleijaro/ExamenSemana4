package com.example.ExamenSemana4.service;

import com.example.ExamenSemana4.entity.Alumno;
import com.example.ExamenSemana4.repository.AlumnoRepository;
import com.example.ExamenSemana4.repository.AlumnoRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepositoryDao alumnoRepositoryDao;
    @Autowired
    AlumnoRepository alumnoRepository;

    public void addAlumno(Alumno alumno) {
        alumnoRepository.creacionAlumno(alumno);
    }

    public List<Alumno> getLista(){
        return null;
    }

    public List<String> getAlumno(Integer id){
        return alumnoRepositoryDao.findAlumno(id);
    }
    /*public Alumno getAlumno(String nombre) {
        return null;
    }*/
}
