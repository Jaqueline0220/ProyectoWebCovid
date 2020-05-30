package com.covid.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.entidad.Alumno;
import com.covid.repositorio.AlumnoRepositorio;

@Service
public class AlumnoServicioImpl implements AlumnoServicio{

	@Autowired
	private  AlumnoRepositorio repositorio;
	
	@Override
	public Alumno insertaAlumno(Alumno obj) {
		/*Alumno objS=repositorio.save(obj);
		if (objS==null) {
			return -1;
		} else {
			return 1;
		}*/
		return repositorio.save(obj);
	}

}
