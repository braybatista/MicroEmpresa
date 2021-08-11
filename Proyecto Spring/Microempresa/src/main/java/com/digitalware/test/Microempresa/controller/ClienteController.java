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

import com.digitalware.test.Microempresa.model.Cliente;
import com.digitalware.test.Microempresa.service.ClienteServiceImpl;


@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins="*")
public class ClienteController {
	
	@Autowired
	@Qualifier("clienteServiceImpl")
	private ClienteServiceImpl servicio;
	
	@GetMapping
	public List<Cliente> listarClientes(){
		return servicio.findAll();
	}
	
	@GetMapping("/{id}")
	public Cliente encontrarClientes(@PathVariable(value="id") int id){
		return servicio.findById(id);
	}
	
	@PostMapping
	public Cliente agregarCliente(@RequestBody Cliente p) {
		return servicio.save(p);
	}
	
	@PutMapping
	public Cliente editarCliente(@RequestBody Cliente p) {
		return servicio.save(p);
	}
	
	@DeleteMapping("/{id}")
	public Cliente deleteCliente(@PathVariable(value="id") int id) {
		Cliente p = servicio.findById(id);
		if(p != null) {
			servicio.deleteById(id);
		}
		return p;
	}
}
