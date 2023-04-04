package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;



@Service
public class ProductoService {

	// Creo el objeto de la clase ProductoRepository
	private final ProductoRepository productoRepository;

	// Cablear con el autowired
	@Autowired
	// Uso ese objeto como parametro de mi constructor
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	// Create(Metodo para agregar un objeto del tipo Producto y guardarlo en la base
	// de datos)
	/*public void crearProducto() {

	}*/

	// Read (Leer una lista de productos)
	public List<Producto> leerProductos() {
		return productoRepository.findAll();
	}// toda la lista de productos

	// Read (leer un producto con un id especifico)
	public Producto getProducto(Long prodId) {
		return productoRepository.findById(prodId)
				.orElseThrow(() -> new IllegalStateException("El Producto " + "con el id " + prodId + " no existe."));
	}// getProducto
	
	//Update para actualizar un producto
    public void actualizarProducto(Long prodId, String nombre, String descripcion, String URL_Imagen, double precio) {
        
        //si el producto existe...
        if(productoRepository.existsById(prodId)) {
            //entonces lo modifico
            Producto productoABuscar = productoRepository.getById(prodId) ;//ya que verifico que mi producto existe, lo traigo y lo asigno a una variable llamada productoABuscar
            if (nombre!= null) productoABuscar.setNombre(nombre);
            if (descripcion!= null) productoABuscar.setDescripcion(descripcion);
            if (precio!= 0) productoABuscar.setPrecio(precio);
            if (URL_Imagen!= null) productoABuscar.setURL_Imagen(URL_Imagen);
            //cuando termino de editar el objeto...
            productoRepository.save(productoABuscar);
        }else {
            System.out.println("El producto con el id " + prodId + " no existe");
        }        
    }

	// Update
	/*public void actualizarProducto() {

	}*/

	// Delete
	public void borrarProducto(Long prodId) {
		if (productoRepository.existsById(prodId)) {
			productoRepository.deleteById(prodId);
		}

	}
}