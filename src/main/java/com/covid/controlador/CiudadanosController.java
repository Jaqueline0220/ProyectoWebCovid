package com.covid.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.covid.entidad.Persona;
import com.covid.servicio.EstadoServicio;
import com.covid.servicio.NacionalidadServicio;
import com.covid.servicio.PersonaServicio;
import com.covid.servicio.RolServicio;
import com.covid.servicio.TipoDocumentoServicio;

@Controller
@SessionAttributes("MENSAJE")
public class CiudadanosController {

	@Autowired
	private PersonaServicio servicio;
	@Autowired
	private EstadoServicio servicioE;
	@Autowired
	private NacionalidadServicio servicioN;
	@Autowired
	private RolServicio servicioR;
	@Autowired
	private TipoDocumentoServicio servicioT;
	
	@RequestMapping("/verCiudadano")
	public String metVerCiudadano() {
		
		return "consultaCiudadanos";
	}
	


	@RequestMapping("/cargaPersona")
	@ResponseBody
	public List<Persona> lista() {
		return servicio.listaPersona();
	}
	
	
}
