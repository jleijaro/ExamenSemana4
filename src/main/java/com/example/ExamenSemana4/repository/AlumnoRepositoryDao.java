package com.example.ExamenSemana4.repository;

import com.example.ExamenSemana4.entity.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface AlumnoRepositoryDao extends CrudRepository<Alumno,Integer> {

    @Query(value = "Select nombre from Alumno t where t.id=:id")
    public List<String> findAlumno(Integer id);
}
