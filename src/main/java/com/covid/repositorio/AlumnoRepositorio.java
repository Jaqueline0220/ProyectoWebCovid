package com.covid.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entidad.Alumno;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {

	//public abstract int insertaAlumno(Alumno obj);
	
}
