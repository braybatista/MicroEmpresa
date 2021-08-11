package com.digitalware.test.Microempresa.service;

import java.util.List;

import com.digitalware.test.Microempresa.model.Material;

public interface MaterialService {
	public abstract List<Material> findAll();
		
	public abstract Material findById(int id);
	
	public abstract Material save(Material p);
	
	public abstract void deleteById(int id);

}
