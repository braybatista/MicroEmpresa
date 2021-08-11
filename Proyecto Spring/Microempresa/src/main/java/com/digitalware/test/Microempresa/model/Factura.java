package com.digitalware.test.Microempresa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Factura {
	@Id
	@Column
	private Integer numero_factura;
	@Column
	private Date fecha_factura;
	@Column
	private Integer codigo_cliente;
	@Column
	private String nombre_cliente;
	@Column
	private String departamento;
	@Column
	private String ciudad;
	@Column
	private String tipo_factura;
	@Column
	private Double total_factura;

	public Integer getNumero_factura() {
		return numero_factura;
	}

	public void setNumero_factura(Integer numero_factura) {
		this.numero_factura = numero_factura;
	}

	public Date getFecha_factura() {
		return fecha_factura;
	}

	public void setFecha_factura(Date fecha_factura) {
		this.fecha_factura = fecha_factura;
	}

	public Integer getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(Integer codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTipo_factura() {
		return tipo_factura;
	}

	public void setTipo_factura(String tipo_factura) {
		this.tipo_factura = tipo_factura;
	}

	public Double getTotal_factura() {
		return total_factura;
	}

	public void setTotal_factura(Double total_factura) {
		this.total_factura = total_factura;
	}

	@Override
	public String toString() {
		return "Factura [numero_factura=" + numero_factura + ", fecha_factura=" + fecha_factura + ", codigo_cliente="
				+ codigo_cliente + ", nombre_cliente=" + nombre_cliente + ", departamento=" + departamento + ", ciudad="
				+ ciudad + ", total_factura=" + total_factura + "]";
	}

}
