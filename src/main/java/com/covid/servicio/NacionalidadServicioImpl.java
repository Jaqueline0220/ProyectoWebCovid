package com.covid.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.entidad.Nacionalidad;
import com.covid.repositorio.NacionalidadRepositorio;

@Service
public class NacionalidadServicioImpl implements NacionalidadServicio{

	@Autowired
	private  NacionalidadRepositorio repositorio;
	
	@Override
	public List<Nacionalidad> listaNacionalidad() {
		return repositorio.findAll();
	}

	@Override
	public Nacionalidad ObtenerNacionalidad(int idnacionalidad) {
		// TODO Auto-generated method stub
		return repositorio.getOne(idnacionalidad);
	}

}
