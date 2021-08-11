package com.digitalware.test.Microempresa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.digitalware.test.Microempresa.model.Producto;
import com.digitalware.test.Microempresa.repository.ProductoRepository;

@Service("productoServiceImpl")
@Transactional
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	@Qualifier("productoRepository")
	private ProductoRepository repositorio;

	@Override
	public List<Producto> findAll() {
		return (List<Producto>) repositorio.findAll();
	}
	
	@Override
	public Producto findById(int id) {
		return repositorio.findById(id).get();
	}

//	@Override
//	public Cliente encontrarPersona(Cliente p) {
//		return repositorio.findById(p.getId()).get();
//	}

	@Override
	public Producto save(Producto p) {
		return repositorio.save(p);
	}

	@Override
	public void deleteById(int id) {
		repositorio.deleteById(id);
	}

}
