package com.digitalware.test.Microempresa.service;

import java.util.List;

import com.digitalware.test.Microempresa.model.Producto;

public interface ProductoService {
	public abstract List<Producto> findAll();
		
	public abstract Producto findById(int id);
	
	public abstract Producto save(Producto p);
	
	public abstract void deleteById(int id);

}
