package com.digitalware.test.Microempresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalware.test.Microempresa.model.Producto;

@Repository("productoRepository")
public interface ProductoRepository  extends JpaRepository<Producto, Integer>{

}
