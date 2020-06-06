package com.covid.controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
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
	
	private List<Persona> lstPersona;
	
	
	public List<Persona> getLstPersona() {
		return lstPersona;
	}
	public void setLstPersona(List<Persona> lstPersona) {
		this.lstPersona = lstPersona;
	}
	@RequestMapping("/verCiudadano")
	public String metVerCiudadano() {
		URL urlForGetRequest = null;
		try {
			urlForGetRequest = new URL("http://env-4252036.j.layershift.co.uk/rest/servicios/persona");
			String readLine = null;
		    HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
		    conection.setRequestMethod("GET");
		    int responseCode = conection.getResponseCode();
		    if (responseCode == HttpURLConnection.HTTP_OK) {
		        BufferedReader in = new BufferedReader(
		            new InputStreamReader(conection.getInputStream()));
		        Type listType = null;
		        while ((readLine = in.readLine()) != null) {
		        	Gson gson = new Gson();
		        	listType = new TypeToken<ArrayList<Persona>>(){}.getType();
		        	ArrayList<Persona> arrayDeJson = gson.fromJson(readLine, listType);
		        	lstPersona=arrayDeJson;
		        } in.close();
		    } else {
		        System.out.println("GET NOT WORKED");
		    }

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "consultaCiudadanos";
	}
	


	@RequestMapping("/cargaPersona")
	@ResponseBody
	public List<Persona> lista() {
		
		return lstPersona;
	}
	
	
}
