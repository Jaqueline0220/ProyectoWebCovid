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
public class LoginController {

	@Autowired
	private AlumnoServicio servicio;
	
	@RequestMapping("/verLogin")
	public String metLogin() {
		
		return "Login";
	}
	
	
	@RequestMapping("/verLoMenu")
	public String metMenuL() {
		
		return "Menu";
	}
	
	
	
	
}
