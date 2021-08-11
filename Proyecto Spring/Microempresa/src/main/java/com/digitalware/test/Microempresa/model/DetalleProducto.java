package com.digitalware.test.Microempresa.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_productos")
public class DetalleProducto {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_detalle_producto;

	@Column
	private Integer codigo_producto;

	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "detalle_producto")
	private List<Material> materiales;

	@Column
	private Integer cantidad_material;

	@Column
	private Double precio_total;

	public Integer getCodigo_detalle_producto() {
		return codigo_detalle_producto;
	}

	public void setCodigo_detalle_producto(Integer codigo_detalle_producto) {
		this.codigo_detalle_producto = codigo_detalle_producto;
	}

	public Integer getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(Integer codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public List<Material> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<Material> materiales) {
		this.materiales = materiales;
	}

	public Integer getCantidad_material() {
		return cantidad_material;
	}

	public void setCantidad_material(Integer cantidad_material) {
		this.cantidad_material = cantidad_material;
	}

	public Double getPrecio_total() {
		return precio_total;
	}

	public void setPrecio_total(Double precio_total) {
		this.precio_total = precio_total;
	}

	@Override
	public String toString() {
		return "DetalleProducto [codigo_detalle_producto=" + codigo_detalle_producto + ", codigo_producto="
				+ codigo_producto + ", materiales=" + materiales + ", cantidad_material=" + cantidad_material
				+ ", precio_total=" + precio_total + "]";
	}

}
