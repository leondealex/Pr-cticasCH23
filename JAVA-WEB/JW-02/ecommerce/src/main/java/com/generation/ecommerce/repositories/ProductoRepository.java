package com.generation.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.ecommerce.model.Producto;

public interface ProductoRepository extends JpaRepository <Producto, Long>{
	
	@Query("SELECT p FROM producto p WHERE p.nombre=?1")
	
	Optional<Producto> findByNombre(String nombre);

}
