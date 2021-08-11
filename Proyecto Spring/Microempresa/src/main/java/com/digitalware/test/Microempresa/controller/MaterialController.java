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

import com.digitalware.test.Microempresa.model.Material;
import com.digitalware.test.Microempresa.service.MaterialServiceImpl;


@RestController
@RequestMapping("/materiales")
@CrossOrigin(origins="*")
public class MaterialController {
	
	@Autowired
	@Qualifier("materialServiceImpl")
	private MaterialServiceImpl servicio;
	
	@GetMapping
	public List<Material> listarMaterials(){
		return servicio.findAll();
	}
	
	@GetMapping("/{id}")
	public Material encontrarMaterials(@PathVariable(value="id") int id){
		return servicio.findById(id);
	}
	
	@PostMapping
	public Material agregarMaterial(@RequestBody Material p) {
		return servicio.save(p);
	}
	
	@PutMapping
	public Material editarMaterial(@RequestBody Material p) {
		return servicio.save(p);
	}
	
	@DeleteMapping("/{id}")
	public Material deleteMaterial(@PathVariable(value="id") int id) {
		Material p = servicio.findById(id);
		if(p != null) {
			servicio.deleteById(id);
		}
		return p;
	}
}
