package com.covid.servicio;

import java.util.List;

import com.covid.entidad.TipoDocumento;


public interface TipoDocumentoServicio {

	//public abstract Estado insertaAlumno(Alumno obj);
	public abstract List<TipoDocumento> listaTipoDocumento();
	
	public abstract TipoDocumento ObtenerTipoDocumento(int idTipoDocumento);
}
