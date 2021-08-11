package com.digitalware.test.Microempresa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.digitalware.test.Microempresa.model.Cliente;
import com.digitalware.test.Microempresa.repository.ClienteRepository;

@Service("clienteServiceImpl")
@Transactional
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	@Qualifier("clienteRepository")
	private ClienteRepository repositorio;

	@Override
	public List<Cliente> findAll() {
		return (List<Cliente>) repositorio.findAll();
	}
	
	@Override
	public Cliente findById(int id) {
		return repositorio.findById(id).get();
	}

//	@Override
//	public Cliente encontrarPersona(Cliente p) {
//		return repositorio.findById(p.getId()).get();
//	}

	@Override
	public Cliente save(Cliente p) {
		return repositorio.save(p);
	}

	@Override
	public void deleteById(int id) {
		repositorio.deleteById(id);
	}

}
