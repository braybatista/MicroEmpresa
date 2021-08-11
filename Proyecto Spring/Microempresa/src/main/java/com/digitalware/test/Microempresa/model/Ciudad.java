package com.digitalware.test.Microempresa.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ciudad")
public class Ciudad {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_ciudad;

	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "codigo_departamento", referencedColumnName = "codigo_departamento")
	private Departamento departamento;

	@Column
	private String nombre_ciudad;

	@Column
	private String descripcion_ciudad;

	public Integer getCodigo_ciudad() {
		return codigo_ciudad;
	}

	public void setCodigo_ciudad(Integer codigo_ciudad) {
		this.codigo_ciudad = codigo_ciudad;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getNombre_ciudad() {
		return nombre_ciudad;
	}

	public void setNombre_ciudad(String nombe_ciudad) {
		this.nombre_ciudad = nombe_ciudad;
	}

	public String getDescripcion_ciudad() {
		return descripcion_ciudad;
	}

	public void setDescripcion_ciudad(String descripcion_ciudad) {
		this.descripcion_ciudad = descripcion_ciudad;
	}

	@Override
	public String toString() {
		return "Ciudad [codigo_ciudad=" + codigo_ciudad + ", departamento=" + departamento + ", nombre_ciudad="
				+ nombre_ciudad + ", descripcion_ciudad=" + descripcion_ciudad + "]";
	}

}
