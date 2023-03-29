package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;



public class ProductoService {
	
	private final ProductoRepository productoRepository;
	
	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	
	//Create
	private void crearProducto() {
	
	}
	
	//Read
	private List<Producto> leerProductos() {
		return productoRepository.findAll();
	}
	
	public Producto leerProducto(Long prodId) {
		return productoRepository.findById(prodId){
			
		}
	}
	
	//Update
	private void actualizarProducto() {
	
	}
	
	//Delete
	private void borrarProducto() {
	
	}
	
}
