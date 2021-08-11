package com.digitalware.test.Microempresa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.digitalware.test.Microempresa.model.Material;
import com.digitalware.test.Microempresa.repository.MaterialesRepository;

@Service("materialServiceImpl")
@Transactional
public class MaterialServiceImpl implements MaterialService{
	
	@Autowired
	@Qualifier("materialRepository")
	private MaterialesRepository repositorio;

	@Override
	public List<Material> findAll() {
		return (List<Material>) repositorio.findAll();
	}
	
	@Override
	public Material findById(int id) {
		return repositorio.findById(id).get();
	}

//	@Override
//	public Material encontrarPersona(Material p) {
//		return repositorio.findById(p.getId()).get();
//	}

	@Override
	public Material save(Material p) {
		return repositorio.save(p);
	}

	@Override
	public void deleteById(int id) {
		repositorio.deleteById(id);
	}

}
