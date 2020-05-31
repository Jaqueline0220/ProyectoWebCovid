package com.covid.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.entidad.Triaje;
import com.covid.repositorio.TriajeRepositorio;

@Service
public class TriajeServicioImpl implements TriajeServicio{

	@Autowired
	private  TriajeRepositorio repositorio;
	
	@Override
	public List<Triaje> listaTriaje() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

}
