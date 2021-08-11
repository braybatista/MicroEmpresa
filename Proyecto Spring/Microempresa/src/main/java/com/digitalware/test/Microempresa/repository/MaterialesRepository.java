package com.digitalware.test.Microempresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalware.test.Microempresa.model.Material;

@Repository("materialRepository")
public interface MaterialesRepository  extends JpaRepository<Material, Integer>{

}
