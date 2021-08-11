package com.digitalware.test.Microempresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalware.test.Microempresa.model.Producto;
import com.digitalware.test.Microempresa.service.ProductoServiceImpl;


@RestController
@RequestMapping("/productos")
@CrossOrigin(origins="*")
public class ProductoController {
	
	@Autowired
	@Qualifier("productoServiceImpl")
	private ProductoServiceImpl servicio;
	
	@GetMapping
	public List<Producto> listarProductos(){
		return servicio.findAll();
	}
	
	@GetMapping("/{id}")
	public Producto encontrarProductos(@PathVariable(value="id") int id){
		return servicio.findById(id);
	}
	
	@PostMapping
	public Producto agregarProducto(@RequestBody Producto p) {
		return servicio.save(p);
	}
	
	@PutMapping
	public Producto editarProducto(@RequestBody Producto p) {
		return servicio.save(p);
	}
	
	@DeleteMapping("/{id}")
	public Producto deleteProducto(@PathVariable(value="id") int id) {
		Producto p = servicio.findById(id);
		if(p != null) {
			servicio.deleteById(id);
		}
		return p;
	}
}
