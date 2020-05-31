package com.covid.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.entidad.Estado;
import com.covid.repositorio.EstadoRepositorio;

@Service
public class EstadoServicioImpl implements EstadoServicio{

	@Autowired
	private EstadoRepositorio repositorio;
	
	@Override
	public List<Estado> listaEstado() {
		return repositorio.findAll();
	}

	@Override
	public Estado ObtenerEstado(int idestado) {
		
		return repositorio.getOne(idestado);
	}
	
}
