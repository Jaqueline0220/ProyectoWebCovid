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
public class AlumnoController {

	@Autowired
	private AlumnoServicio servicio;
	
	@RequestMapping("/verAlumno")
	public String metVerAlumno() {
		
		return "registraAlumno";
	}
	
	@RequestMapping("/registroDeAlumno")
	public String metRegistraAlumno(Alumno obj, Model m) {
		Alumno s = servicio.insertaAlumno(obj);
		if (s==null)
			m.addAttribute("MENSAJE", "Registro erroneo");
		else
			m.addAttribute("MENSAJE", "Registro exitoso");
		return "redirect:verAlumno";
	}
	
	
	
}
