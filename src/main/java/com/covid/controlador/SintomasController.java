package com.covid.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.covid.entidad.Triaje;
import com.covid.servicio.TriajeServicio;

@Controller
@SessionAttributes("MENSAJE")
public class SintomasController {

	@Autowired
	private TriajeServicio servicio;
	
	@RequestMapping("/verSintomas")
	public String metVerSintomas() {
		
		return "consultaSintomas";
	}
	
	
	@RequestMapping("/cargaTriage")
	@ResponseBody
	public List<Triaje> lista() {
		return servicio.listaTriaje();
	}
	
	
}
