package com.covid.entidad;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name ="persona")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "idPersona")
public class Persona{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpersona")
	private int idPersona;
	
	private String numDoc;
	
	@Column(name = "numCel")
	private String numcel;

	@ManyToOne
	@JoinColumn(name = "idtipoDocumento")
	private TipoDocumento tipoDocumento;

	@ManyToOne
	@JoinColumn(name = "idnacionalidad")
	private Nacionalidad nacionalidad;

	@ManyToOne
	@JoinColumn(name = "idrol")
	private Rol rol;

	@ManyToOne
	@JoinColumn(name = "idestado")
	private Estado estado;
	
	@OneToMany(mappedBy = "persona",fetch = FetchType.LAZY)
	private List<Triaje> triajeP;
	
	
	public List<Triaje> getTriajeP() {
		return triajeP;
	}
	public void setTriajeP(List<Triaje> triajeP) {
		this.triajeP = triajeP;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}
	public String getNumcel() {
		return numcel;
	}
	public void setNumcel(String numcel) {
		this.numcel = numcel;
	}
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	

}
