package com.example.ExamenSemana4;

import com.example.ExamenSemana4.entity.Alumno;
import com.example.ExamenSemana4.repository.AlumnoRepositoryDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ExamenSemana4Application {

	public static void main(String[] args) {
		SpringApplication.run(ExamenSemana4Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(AlumnoRepositoryDao alumnoRepositoryDao) {
		return args -> {
			Alumno curso=new Alumno("a");
			Alumno cursoA=new Alumno("aa");
			Alumno cursoB=new Alumno("ab");

			//Teacher teacher=new Teacher(List.of(curso,cursoA,cursoB), "aaaa", "direc aa",30);
			//teacherRepositoryDao.save(teacher);
		};
	}

}
