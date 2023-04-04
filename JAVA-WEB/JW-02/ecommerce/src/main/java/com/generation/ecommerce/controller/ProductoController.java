package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;


@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
        RequestMethod.PUT })



@RestController // Es un controllar para soportar metodos HTTP

@RequestMapping(path = "/miOtso/productos/") /*
												 * Indica la ruta o URL de nestro endpoint para saber donde se manejan
												 * esas solicitudes HTTP
												 */
public class ProductoController {

	// Inyeccion de dependencia
	/*
	 * Declara la instancia de la Clase ProductoService que se utiliza para acceder
	 * a los metodos definidos, ahí se declara como final porque su valor no sera
	 * cambiado despues de inicializar, para que esta instancia no cambie durante la
	 * ejecucion del programa.
	 */

	private final ProductoService productoServicio; // "No nos llames, nosotros te llamamos"

	@Autowired /*
				 * Se usa para indicar a Spring que inyecte automaticamente una instancia del
				 * productoSericio en la clase ProductoController. Asi nos aseguramos que la
				 * instancia esta disponible y la lista para usarse cuando se necesite en la
				 * clase.
				 */

	// Segunda parte de inyeccion de dependencia
	// Constructor con ese objeto como parametro
	public ProductoController(ProductoService productoServicio) {
		this.productoServicio = productoServicio;
	}

	// HHTP GET
	@GetMapping
	public List<Producto> getProducto() {
		return productoServicio.leerProductos();
	}

	/*
	 * // HTTP POST
	 * 
	 * @PostMapping public postProducto() { return productoServicio.crearProducto();
	 * }
	 * 
	 * // HTPP PUT
	 * 
	 * @PutMapping public putProducto() { return
	 * productoServicio.actualizarProducto(); }
	 * 
	 * // HTTP DELETE
	 * 
	 * @DeleteMapping public deleteProducto() { return
	 * productoServicio.borrarProducto(); }
	 */
}
