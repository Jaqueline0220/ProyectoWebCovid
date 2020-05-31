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
@Table(name = "tipo_documento")
public class TipoDocumento{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtipo_documento")
	int idTipoDocumento;
	String descripcion;

	@OneToMany(mappedBy = "tipoDocumento",fetch = FetchType.LAZY)
	private List<Persona> persona;
	
	
	public List<Persona> getEstaPers() {
		return persona;
	}
	public void setEstaPers(List<Persona> estaPers) {
		this.persona = estaPers;
	}
	
	public int getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
