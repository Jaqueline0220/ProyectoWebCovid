package com.covid.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;


import com.covid.entidad.Rol;

public interface RolRepositorio extends JpaRepository<Rol, Integer> {

	//public abstract int insertaAlumno(Alumno obj);
	
}
