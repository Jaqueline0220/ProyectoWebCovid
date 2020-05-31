package com.covid.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.entidad.TipoDocumento;
import com.covid.repositorio.TipoDocumentoRepositorio;

@Service
public class TipoDocumentoServicioImpl implements TipoDocumentoServicio{

	@Autowired
	private  TipoDocumentoRepositorio repositorio;
	
	@Override
	public List<TipoDocumento> listaTipoDocumento() {
		return repositorio.findAll();
	}

	@Override
	public TipoDocumento ObtenerTipoDocumento(int idTipoDocumento) {
		// TODO Auto-generated method stub
		return repositorio.getOne(idTipoDocumento);
	}

}
