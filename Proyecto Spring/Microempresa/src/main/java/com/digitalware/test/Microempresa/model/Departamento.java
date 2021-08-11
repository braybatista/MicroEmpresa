package com.digitalware.test.Microempresa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_departamento;
	@Column
	private String nombre_departamento;
	@Column
	private String descripcion_departamento;

	public Integer getCodigo_departamento() {
		return codigo_departamento;
	}

	public void setCodigo_departamento(Integer codigo_departamento) {
		this.codigo_departamento = codigo_departamento;
	}

	public String getNombre_departamento() {
		return nombre_departamento;
	}

	public void setNombre_departamento(String nombe_departamento) {
		this.nombre_departamento = nombe_departamento;
	}

	public String getDescripcion_departamento() {
		return descripcion_departamento;
	}

	public void setDescripcion_departamento(String descripcion_departamento) {
		this.descripcion_departamento = descripcion_departamento;
	}

	@Override
	public String toString() {
		return "Departamento [codigo_departamento=" + codigo_departamento + ", nombre_departamento=" + nombre_departamento
				+ ", descripcion_departamento=" + descripcion_departamento + "]";
	}

}
