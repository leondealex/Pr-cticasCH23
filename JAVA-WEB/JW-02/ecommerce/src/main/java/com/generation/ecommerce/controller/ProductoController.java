package com.generation.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.generation.ecommerce.services.ProductoService;

public ProductoController (ProductoService productoServicio) {
	this.productoServicio = productoServicio;
}
	
	
	//HTTP GET
	@GetMapping
	public getProducto() {
		return productoServicio.leerProducto();
	}
	
	//HTTP POST
	@PostMapping
	public postProducto() {
		return productoServicio.crearProducto();
	}
	
	//HTTP PUT
	@PutMapping
	public putProducto() {
		return productoServicio.Producto();
	}
	
	//HTTP DELETE
	@DeleteMapping
	public deleteProducto() {
		return productoServicio.borrarProducto();
	}
	
	/*

    Colecciones o Collections
    
        - Array
        
    Estructura de datos lineal, siempre contiene datos del mismo tipo. Los datos estan almacenados de forma contigua en la memoria. Se accede a los elementos a traves de un indice.
    
        - Tamanio fijo
        - Acceso rapido
        - Coste elevado para insertar o eliminar elementos. 
        
        
    
        - Set (conjuntos)
    Estructuras de datos que almacena elementos unicos y sin orden.
    
        - No hay elementos elementos duplicados. Si trato de agregar un elemento repetido, el conjunto lo ignora.
        - No hay orden especifico (puede ser bueno o malo para acceder a la informacion)
        - Busqueda rapida: hay funciones especificas de este conjunto para buscar informacion
    
        
        
        
        - Map (mapas)
    Estructura de datos que almacena informacion en pares de clave-valor. 
        
        - Almancena informacion en pares (clave unica)
        - No hay orden especifico 
        - Busqueda rapida: si conozco la llave, conozco el dato que puedo tomar
        
        
        
        
        - ArrayList
        - HashSet
        - HashMap


*/
	
	//Declara la instancia de la Clase ProductoService que se utiliza para acceder a los metodos definidos ahi.Se declara como final porque su valor no sera cambiado despues de inicializar, para que esta instancia no cambie durante la ejecucion del programa

    private final ProductoService productoServicio; //"no nos llames, nosotros te llamamos"
    
    
    @Autowired //Se usa para indicar a Spring que inyecte automaticamente una instancia del ProductoService en la clase ProductoController. Asi nos aseguramos que la instancia esta disponible y lista para usarse cuando se necesite en la clase.
    

    //Constructor con ese objeto como parametro
    public ProductoController (ProductoService productoServicio) {
        this.productoServicio = productoServicio;
    }//constructor

}
