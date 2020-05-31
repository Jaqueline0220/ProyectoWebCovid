package com.covid.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entidad.Estado;

public interface EstadoRepositorio extends JpaRepository<Estado, Integer> {

	//public abstract int insertaAlumno(Alumno obj);
	
}
