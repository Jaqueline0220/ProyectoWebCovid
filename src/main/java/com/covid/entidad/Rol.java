package com.covid.entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "rol")
public class Rol{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idRol;
	String  nombreRol;
	
	
	@OneToMany(mappedBy = "rol",fetch = FetchType.LAZY)
	private List<Persona> persona;
	
	
	public List<Persona> getEstaPers() {
		return persona;
	}
	public void setEstaPers(List<Persona> estaPers) {
		this.persona = estaPers;
	}
	
	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	
}
