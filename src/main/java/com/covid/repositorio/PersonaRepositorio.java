package com.covid.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entidad.Persona;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

	//public abstract int insertaAlumno(Alumno obj);
	
}
