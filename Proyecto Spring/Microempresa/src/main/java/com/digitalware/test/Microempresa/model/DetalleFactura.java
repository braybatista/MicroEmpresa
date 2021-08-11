package com.digitalware.test.Microempresa.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_detalle_factura;

	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "numero_factura", referencedColumnName = "numero_factura")
	private EncabezadoFactura factura;

	@OneToMany(mappedBy = "detalle_factura")
	private List<Producto> productos;

	@Column
	private int cantidad_producto_factura;

	@Column
	private Double valor_unitario_producto;

	@Column
	private Double total_producto_factura;

	public Integer getCodigo_detalle_factura() {
		return codigo_detalle_factura;
	}

	public void setCodigo_detalle_factura(Integer codigo_detalle_factura) {
		this.codigo_detalle_factura = codigo_detalle_factura;
	}

	public EncabezadoFactura getFactura() {
		return factura;
	}

	public void setFactura(EncabezadoFactura factura) {
		this.factura = factura;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public int getCantidad_producto_factura() {
		return cantidad_producto_factura;
	}

	public void setCantidad_producto_factura(int cantidad_producto_factura) {
		this.cantidad_producto_factura = cantidad_producto_factura;
	}

	public Double getValor_unitario_producto() {
		return valor_unitario_producto;
	}

	public void setValor_unitario_producto(Double valor_unitario_producto) {
		this.valor_unitario_producto = valor_unitario_producto;
	}

	public Double getTotal_producto_factura() {
		return total_producto_factura;
	}

	public void setTotal_producto_factura(Double total_producto_factura) {
		this.total_producto_factura = total_producto_factura;
	}

	@Override
	public String toString() {
		return "DetalleFactura [codigo_detalle_factura=" + codigo_detalle_factura + ", factura=" + factura
				+ ", productos=" + productos + ", cantidad_producto_factura=" + cantidad_producto_factura
				+ ", valor_unitario_producto=" + valor_unitario_producto + ", total_producto_factura="
				+ total_producto_factura + "]";
	}

}
