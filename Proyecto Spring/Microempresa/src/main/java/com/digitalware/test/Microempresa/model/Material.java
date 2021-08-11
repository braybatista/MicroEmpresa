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
@Table(name="materiales")
public class Material {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_material;
	
	@Column(nullable = true, length = 100)
	private String descripcion_material;
	
	@Column
	private Double precio_material;
	
	@ManyToOne
    @JoinColumn(name = "FK_Material_Detalle_Producto", nullable = false, updatable = false)
    private DetalleProducto detalle_producto;
	
	public Integer getCodigo_material() {
		return codigo_material;
	}
	
	public void setCodigo_material(Integer codigo_material) {
		this.codigo_material = codigo_material;
	}
	
	public String getDescripcion_material() {
		return descripcion_material;
	}
	
	public void setDescripcion_material(String descripcion_material) {
		this.descripcion_material = descripcion_material;
	}
	
	public Double getPrecio_material() {
		return precio_material;
	}
	
	public void setPrecio_material(Double precio_material) {
		this.precio_material = precio_material;
	}
	
	@Override
	public String toString() {
		return "Material [codigo_material=" + codigo_material + ", descripcion_material=" + descripcion_material
				+ ", precio_material=" + precio_material + "]";
	}
}
