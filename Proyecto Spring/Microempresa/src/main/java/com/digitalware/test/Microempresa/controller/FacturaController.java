package com.digitalware.test.Microempresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalware.test.Microempresa.model.Factura;
import com.digitalware.test.Microempresa.service.FacturaServiceImpl;


@RestController
@RequestMapping("/facturas")
@CrossOrigin(origins="*")
public class FacturaController {
	
	@Autowired
	@Qualifier("facturaServiceImpl")
	private FacturaServiceImpl servicio;
	
	@GetMapping
	public List<Factura> findAll(){
		return servicio.findCustom();
	}
	
}
