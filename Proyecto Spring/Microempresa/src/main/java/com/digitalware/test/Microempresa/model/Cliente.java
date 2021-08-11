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
@Table(name = "clientes")
public class Cliente {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_cliente;

	@Column(nullable = false, length = 15)
	private String numero_identificacion_cliente;

	@Column
	private String tipo_identificacion_cliente;

	@Column(nullable = false, length = 75)
	private String nombre_cliente;

	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "codigo_departamento_reside_cliente", referencedColumnName = "codigo_departamento")
	private Departamento departamento;

	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "codigo_ciudad_reside_cliente", referencedColumnName = "codigo_ciudad")
	private Ciudad ciudad;

	@Column(nullable = false, length = 20)
	private String direccion_cliente;

	@Column
	private String telefono_cliente;

	@Column(nullable = false, columnDefinition = "text")
	private String foto_cliente;

	public Integer getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(Integer codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNumero_identificacion_cliente() {
		return numero_identificacion_cliente;
	}

	public void setNumero_identificacion_cliente(String numero_identificacion_cliente) {
		this.numero_identificacion_cliente = numero_identificacion_cliente;
	}

	public String getTipo_identificacion_cliente() {
		return tipo_identificacion_cliente;
	}

	public void setTipo_identificacion_cliente(String tipo_identificacion_cliente) {
		this.tipo_identificacion_cliente = tipo_identificacion_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion_cliente() {
		return direccion_cliente;
	}

	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}

	public String getTelefono_cliente() {
		return telefono_cliente;
	}

	public void setTelefono_cliente(String telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}

	public String getFoto_cliente() {
		return foto_cliente;
	}

	public void setFoto_cliente(String foto_cliente) {
		this.foto_cliente = foto_cliente;
	}

	@Override
	public String toString() {
		return "Cliente [codigo_cliente=" + codigo_cliente + ", numero_identificacion_cliente="
				+ numero_identificacion_cliente + ", tipo_identificacion_cliente=" + tipo_identificacion_cliente
				+ ", nombre_cliente=" + nombre_cliente + ", departamento=" + departamento + ", ciudad=" + ciudad
				+ ", direccion_cliente=" + direccion_cliente + ", telefono_cliente=" + telefono_cliente
				+ ", foto_cliente=" + foto_cliente + "]";
	}

}
