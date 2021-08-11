package com.digitalware.test.Microempresa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_producto;
	
	@Column
	private String descripcion_producto;
	
	@Column
	private String fecha_creacion_producto;
	
	@Column
	private Double impuesto_producto;
	
	@ManyToOne
    @JoinColumn(name = "FK_Producto_Detalle_Factura", nullable = false, updatable = false)
    private DetalleFactura detalle_factura;

	public Integer getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(Integer codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public String getDescripcion_producto() {
		return descripcion_producto;
	}

	public void setDescripcion_producto(String descripcion_producto) {
		this.descripcion_producto = descripcion_producto;
	}

	public String getFecha_creacion_producto() {
		return fecha_creacion_producto;
	}

	public void setFecha_creacion_producto(String fecha_creacion_producto) {
		this.fecha_creacion_producto = fecha_creacion_producto;
	}

	public Double getImpuesto_producto() {
		return impuesto_producto;
	}

	public void setImpuesto_producto(Double impuesto_producto) {
		this.impuesto_producto = impuesto_producto;
	}

	@Override
	public String toString() {
		return "Producto [codigo_producto=" + codigo_producto + ", descripcion_producto=" + descripcion_producto
				+ ", fecha_creacion_producto=" + fecha_creacion_producto + ", impuesto_producto=" + impuesto_producto
				+ "]";
	}

}
