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
@Table(name = "estado")
public class Estado{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idestado")
	private int idEstado;
	private String descripcion;

	@OneToMany(mappedBy = "estado",fetch = FetchType.LAZY)
	private List<Persona> persona;
	
	public List<Persona> getEstaPers() {
		return persona;
	}
	public void setEstaPers(List<Persona> estaPers) {
		this.persona = estaPers;
	}
	
	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
