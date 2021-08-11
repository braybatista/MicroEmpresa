package com.digitalware.test.Microempresa.service;

import java.util.List;

import com.digitalware.test.Microempresa.model.Factura;

public interface FacturaService {
	public abstract List<Factura> findAll();
	
	public abstract List<Factura> findCustom();
}
