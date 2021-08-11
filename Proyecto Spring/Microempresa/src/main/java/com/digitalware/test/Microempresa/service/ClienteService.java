package com.digitalware.test.Microempresa.service;

import java.util.List;

import com.digitalware.test.Microempresa.model.Cliente;

public interface ClienteService {
	public abstract List<Cliente> findAll();
		
	public abstract Cliente findById(int id);
	
	public abstract Cliente save(Cliente p);
	
	public abstract void deleteById(int id);

}
