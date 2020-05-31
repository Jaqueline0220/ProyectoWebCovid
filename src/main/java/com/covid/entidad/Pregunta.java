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
@Table(name = "pregunta")
public class Pregunta{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpregunta")
	int idPregunta;
	String  descripcion;

	@OneToMany(mappedBy = "pregunta",fetch = FetchType.LAZY)
	private List<Triaje> triajeP;
	
	public List<Triaje> getTriajeP() {
		return triajeP;
	}

	public void setTriajeP(List<Triaje> triajeP) {
		this.triajeP = triajeP;
	}

	public int getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
