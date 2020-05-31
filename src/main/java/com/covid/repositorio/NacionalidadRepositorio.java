package com.covid.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entidad.Nacionalidad;

public interface NacionalidadRepositorio extends JpaRepository<Nacionalidad, Integer> {

	//public abstract int insertaAlumno(Alumno obj);
	
}
