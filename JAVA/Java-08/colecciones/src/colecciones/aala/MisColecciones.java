package colecciones.aala;

import java.util.*;


public class MisColecciones {

	public static void main(String[] args) {

		wrapperClass();
	}
	
	public void listasCollections() {
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);

	}
	
	private void imprimir(Collection Collection) {
		for (object elementos : Collection) {
			
		}

	}
	
	
	
	static void wrapperClass() {
	//byte, short, char, long, float, double, int
		
		byte numeroB = -128;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor Max " + Byte.MAX_VALUE);
		System.out.println("Valor Min " + Byte.MIN_VALUE);
		System.out.println("--> " + numeroB);
		
		int numeroI = 2147483647;
		System.out.println("Tamaño de un entero: " + Integer.BYTES);
		System.out.println("Tamaño de un entero: " + Integer.SIZE);
		System.out.println("Valor Max entero: " + Integer.MAX_VALUE);
		System.out.println("Valor Min entero: " + Integer.MIN_VALUE);
		System.out.println("--> " + numeroI);
		
		System.out.println("Tamaño de un short: " + Short.BYTES);
		System.out.println("Tamaño de un long: " + Long.BYTES);
		System.out.println("Tamaño de un float: " + Float.BYTES);
		System.out.println("Tamaño de un double: " + Double.BYTES);
		
	}
	
	
	
	
	
	
	
	
	
	

}
