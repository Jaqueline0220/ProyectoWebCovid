package com.covid.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entidad.Triaje;

public interface TriajeRepositorio extends JpaRepository<Triaje, Integer> {

	//public abstract int insertaAlumno(Alumno obj);
	
}
