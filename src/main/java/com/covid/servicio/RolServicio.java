package com.covid.servicio;

import java.util.List;

import com.covid.entidad.Rol;


public interface RolServicio {

	//public abstract Estado insertaAlumno(Alumno obj);
	public abstract List<Rol> listaRol();
	
	public abstract Rol ObtenerRol(int idrol);
	
}
