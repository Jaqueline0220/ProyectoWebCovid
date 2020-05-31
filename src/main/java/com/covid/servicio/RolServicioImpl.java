package com.covid.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.entidad.Rol;
import com.covid.repositorio.RolRepositorio;

@Service
public class RolServicioImpl implements RolServicio{

	@Autowired
	private  RolRepositorio repositorio;
	
	@Override
	public List<Rol> listaRol() {
		return repositorio.findAll();
	}

	@Override
	public Rol ObtenerRol(int idrol) {
		// TODO Auto-generated method stub
		return repositorio.getOne(idrol);
	}

}
