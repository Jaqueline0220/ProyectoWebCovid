package com.covid.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.covid.entidad.Alumno;
import com.covid.servicio.AlumnoServicio;

@Controller
@SessionAttributes("MENSAJE")
public class SintomasController {

	@Autowired
	private AlumnoServicio servicio;
	
	@RequestMapping("/verSintomas")
	public String metVerSintomas() {
		
		return "consultaSintomas";
	}
	
	
	
	
	
}
