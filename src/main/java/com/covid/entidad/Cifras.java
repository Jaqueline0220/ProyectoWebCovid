package com.covid.entidad;


public class Cifras{
	private String fecha;
	private int idCifras,nuevos,totales,fallecidos,recuperados;
	private Departamento departamento;
	private int iddepartamento;
	
	
	
	public int getIddepartamento() {
		return iddepartamento;
	}
	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getIdCifras() {
		return idCifras;
	}
	public void setIdCifras(int idCifras) {
		this.idCifras = idCifras;
	}
	public int getNuevos() {
		return nuevos;
	}
	public void setNuevos(int nuevos) {
		this.nuevos = nuevos;
	}
	public int getTotales() {
		return totales;
	}
	public void setTotales(int totales) {
		this.totales = totales;
	}
	public int getFallecidos() {
		return fallecidos;
	}
	public void setFallecidos(int fallecidos) {
		this.fallecidos = fallecidos;
	}
	public int getRecuperados() {
		return recuperados;
	}
	public void setRecuperados(int recuperados) {
		this.recuperados = recuperados;
	}
	
	
	
}
