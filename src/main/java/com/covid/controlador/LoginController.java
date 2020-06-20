package com.covid.controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.covid.entidad.Persona;
import com.covid.entidad.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


@Controller
@SessionAttributes("MENSAJE")
public class LoginController {

	@RequestMapping("/verLogin")
	public String metLogin() {
		
		return "Login";
	}
	
	
	@RequestMapping("/verValidarUsuario")
	public String metMenuL(User bean, Model m) {
		System.out.println(bean.getUser());
		System.out.println(bean.getContrasenia());
		if(bean.getUser().equals(bean.getContrasenia())) {
			String readLine=ObtenerJsonPersona("http://env-6360882.j.layershift.co.uk/rest/servicios/persona/"+bean.getContrasenia());
			Type listType = null;
			Gson gson = new Gson();
			listType = new TypeToken<ArrayList<Persona>>(){}.getType();
	    	ArrayList<Persona> arrayDeJson = gson.fromJson(readLine, listType);
			if (arrayDeJson.size()==0) {
				m.addAttribute("MENSAJE", "Usuario y contraseña incorrectos");
			}else {
				for (Persona persona : arrayDeJson) {
					if (persona.getRol().getNombreRol().equals("ADMIN")) {
						return "Menu";
					} else {
						m.addAttribute("MENSAJE", "Usted no cuenta con los permisos necesarios");
						return "Login";
					}
				}
				
			}
			
		}else {
			m.addAttribute("MENSAJE", "Usuario y contraseña incorrectos");
		}
		
		return "Login";
	}
	
	
	public String ObtenerJsonPersona(String url) {
		URL urlgetTipodoc = null;
		String readLine = null;
		try {
			urlgetTipodoc = new URL(url);
			HttpURLConnection conection = (HttpURLConnection) urlgetTipodoc.openConnection();
			conection.setRequestMethod("GET");
			int responseCode = conection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
				readLine = in.readLine();
				in.close();
			} else {
				System.out.println("GET NOT WORKED");
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return readLine;
	}
	
	
}
