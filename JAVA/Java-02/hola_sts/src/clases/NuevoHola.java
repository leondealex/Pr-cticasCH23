package clases;
import java.util.Scanner;
public class NuevoHola {
	private String nombre;
	// para inicializar la variable (objeto de tipo String)
	//usamos el metodo constructor
	public NuevoHola(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void saludo() {
		System.out.println("Hola desde java sts de nuevo " + this.nombre);
	}
	
	public void saludoConNombre() {
		System.out.print("Hola tu eres: " + this.nombre);
		
	}
	
	
	
	
}