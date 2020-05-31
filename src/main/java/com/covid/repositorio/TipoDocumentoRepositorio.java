package com.covid.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entidad.TipoDocumento;


public interface TipoDocumentoRepositorio extends JpaRepository<TipoDocumento, Integer> {

	//public abstract int insertaAlumno(Alumno obj);
	
}
