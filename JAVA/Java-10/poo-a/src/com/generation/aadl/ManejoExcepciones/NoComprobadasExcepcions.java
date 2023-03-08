package com.generation.aadl.ManejoExcepciones;


import java.util.Scanner;

public class NoComprobadasExcepcions {
public static void main(String[] args) {
	Scanner dato = new Scanner(System.in);
	System.out.println("Introduzca un valor: ");
	int divisor;
	
	
	
	try {
		divisor = Integer.parseInt(dato.next());
		int division = 10/divisor;
		System.out.println("--> " + division);
	
	}catch(ArithmeticException e) {
	System.out.println("Capturar la Excepcion" + e.getMessage());
}catch(NumberFormatException nfe) {
	System.out.println("El dato no es numerico " + nfe.getMessage());
}finally {
	System.out.println("Este blok es opcional y se va a ejecutar con o sin la excepcion");
}
	
	System.out.println("Continuamos con el flujo de la aplicación");
}


}
