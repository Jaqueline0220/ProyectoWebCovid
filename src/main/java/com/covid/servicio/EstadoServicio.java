package com.covid.servicio;

import java.util.List;

import com.covid.entidad.Estado;


public interface EstadoServicio {

	//public abstract Estado insertaAlumno(Alumno obj);
	public abstract List<Estado> listaEstado();
	
	public abstract Estado ObtenerEstado(int idestado);
	
}
