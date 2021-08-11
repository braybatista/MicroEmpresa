package com.digitalware.test.Microempresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.digitalware.test.Microempresa.model.Factura;

@Repository("facturaRepository")
public interface FacturaRepository  extends JpaRepository<Factura, Integer>{
	
	public List<Factura> findAll();
	
	@Modifying
	@Query(value = 
			"select "
				+ "ef.numero_factura as numero_factura, " 
				+ "ef.fecha_factura as fecha_factura, " 
				+ "cl.codigo_cliente as codigo_cliente, " 
				+ "cl.nombre_cliente as nombre_cliente, " 
				+ "dep.nombre_departamento as departamento, " 
				+ "ci.nombre_ciudad as ciudad, " 
				+ "ef.tipo_factura as tipo_factura, "
				+ "ef.total_factura as total_factura "
			+ "from encabezado_factura ef, clientes cl, departamento dep, ciudad ci "
			+ "where ef.codigo_cliente = cl.codigo_cliente "
			+ "and ef.codigo_departamento_factura = dep.codigo_departamento "
			+ "and ef.codigo_ciudad_factura = ci.codigo_ciudad", nativeQuery = true)
	public List<Factura> findCustom();
}
