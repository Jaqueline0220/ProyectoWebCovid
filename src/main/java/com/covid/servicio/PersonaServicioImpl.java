package com.covid.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.entidad.Persona;
import com.covid.repositorio.PersonaRepositorio;

@Service
public class PersonaServicioImpl implements PersonaServicio{

	@Autowired
	private  PersonaRepositorio repositorio;
	
	@Override
	public List<Persona> listaPersona() {
		return repositorio.findAll();
	}

}
