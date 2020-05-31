package com.covid.servicio;

import java.util.List;

import com.covid.entidad.Nacionalidad;


public interface NacionalidadServicio {

	//public abstract Estado insertaAlumno(Alumno obj);
	public abstract List<Nacionalidad> listaNacionalidad();
	
	public abstract Nacionalidad ObtenerNacionalidad(int idnacionalidad);
	
}
