package com.digitalware.test.Microempresa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.digitalware.test.Microempresa.model.Factura;
import com.digitalware.test.Microempresa.repository.FacturaRepository;

@Service("facturaServiceImpl")
@Transactional
public class FacturaServiceImpl implements FacturaService{
	
	@Autowired
	@Qualifier("facturaRepository")
	private FacturaRepository repositorio;

	@Override
	public List<Factura> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<Factura> findCustom() {
		return repositorio.findCustom();
	}

}
