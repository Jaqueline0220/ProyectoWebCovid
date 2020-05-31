package com.covid.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name ="triaje")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "idTriaje")
public class Triaje{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtriaje")
	private int idTriaje;
	
	private String  respuesta;
	
	@ManyToOne
	@JoinColumn(name = "idpregunta")
	private Pregunta pregunta;
	
	@ManyToOne
	@JoinColumn(name = "idpersona")
	private Persona persona;
	
	public int getIdTriaje() {
		return idTriaje;
	}
	public void setIdTriaje(int idTriaje) {
		this.idTriaje = idTriaje;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public Pregunta getPregunta() {
		return pregunta;
	}
	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	

}
