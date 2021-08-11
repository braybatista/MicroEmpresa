package com.digitalware.test.Microempresa.model;

import java.util.Date;

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
@Table(name = "encabezado_factura")
public class EncabezadoFactura {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numero_factura;

	@Column
	private Date fecha_factura;

	@Column
	private String direccion_factura;

	@Column
	private String telefono_factura;

	@Column
	private Double total_factura;

	@Column
	private String tipo_factura;

	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "codigo_departamento_factura", referencedColumnName = "codigo_departamento")
	private Departamento departamento;

	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "codigo_ciudad_factura", referencedColumnName = "codigo_ciudad")
	private Ciudad ciudad;

	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "codigo_cliente", referencedColumnName = "codigo_cliente")
	private Cliente cliente;

	@Column
	private Date fecha_inicial_factura;

	@Column(nullable = true)
	private Date fecha_final_factura;

	public Long getNumero_factura() {
		return numero_factura;
	}

	public void setNumero_factura(Long numero_factura) {
		this.numero_factura = numero_factura;
	}

	public Date getFecha_factura() {
		return fecha_factura;
	}

	public void setFecha_factura(Date fecha_factura) {
		this.fecha_factura = fecha_factura;
	}

	public String getDireccion_factura() {
		return direccion_factura;
	}

	public void setDireccion_factura(String direccion_factura) {
		this.direccion_factura = direccion_factura;
	}

	public String getTelefono_factura() {
		return telefono_factura;
	}

	public void setTelefono_factura(String telefono_factura) {
		this.telefono_factura = telefono_factura;
	}

	public Double getTotal_factura() {
		return total_factura;
	}

	public void setTotal_factura(Double total_factura) {
		this.total_factura = total_factura;
	}

	public String getTipo_factura() {
		return tipo_factura;
	}

	public void setTipo_factura(String tipo_factura) {
		this.tipo_factura = tipo_factura;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFecha_inicial_factura() {
		return fecha_inicial_factura;
	}

	public void setFecha_inicial_factura(Date fecha_inicial_factura) {
		this.fecha_inicial_factura = fecha_inicial_factura;
	}

	public Date getFecha_final_factura() {
		return fecha_final_factura;
	}

	public void setFecha_final_factura(Date fecha_final_factura) {
		this.fecha_final_factura = fecha_final_factura;
	}

	@Override
	public String toString() {
		return "EncabezadoFactura [numero_factura=" + numero_factura + ", fecha_factura=" + fecha_factura
				+ ", direccion_factura=" + direccion_factura + ", telefono_factura=" + telefono_factura
				+ ", total_factura=" + total_factura + ", tipo_factura=" + tipo_factura + ", departamento="
				+ departamento + ", ciudad=" + ciudad + ", cliente=" + cliente + ", fecha_inicial_factura="
				+ fecha_inicial_factura + ", fecha_final_factura=" + fecha_final_factura + "]";
	}

}
