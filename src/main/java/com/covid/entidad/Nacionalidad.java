package com.covid.entidad;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "nacionalidad")
public class Nacionalidad{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idnacionalidad")
	private int idNacionalidad;
	private String  nombreNacionalidad;

	
	@OneToMany(mappedBy = "nacionalidad",fetch = FetchType.LAZY)
	private List<Persona> persona;
	
	
	public List<Persona> getEstaPers() {
		return persona;
	}
	public void setEstaPers(List<Persona> estaPers) {
		this.persona = estaPers;
	}
	
	public int getIdNacionalidad() {
		return idNacionalidad;
	}

	public void setIdNacionalidad(int idNacionalidad) {
		this.idNacionalidad = idNacionalidad;
	}

	public String getNombreNacionalidad() {
		return nombreNacionalidad;
	}

	public void setNombreNacionalidad(String nombreNacionalidad) {
		this.nombreNacionalidad = nombreNacionalidad;
	}
	

}
