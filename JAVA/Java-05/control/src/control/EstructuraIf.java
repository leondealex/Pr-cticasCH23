package control;

import java.security.PublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
public void controlIf() {
	// TODO Auto-generated method stub

	/*
	if (condition) {
		
	} else {

	}*/
	
	long nota = 5;
	if (nota > 5) {
		System.out.println( nota +" Es una nota aprobatoria ");
	}
		System.out.println("Continua con el proceso");
	
	if (nota > 5 ) {
		System.out.println(nota + " Es una nota aprobatoria");
	} else {
		System.out.println(nota + " Es una nota no aprobatoria");
	}
	}
	
	public void divisible() {
		// TODO Auto-generated method stub
		System.out.print("Introduce un numero: ");
		int dato = entrada.nextInt();
		System.out.print("Introduce otro numero: ");
		int dato1 = entrada.nextInt();
		if (dato % dato1 == 0) {
			System.out.println( dato + " es divisible entre " + dato1);
		} else {
			System.out.println( dato + " no es divisible entre " + dato1);
		}
	}
		
		
	public void comparar() {
		// TODO Auto-generated method stub
		System.out.print("Introduce un numero: ");
		int valor = entrada.nextInt();
		System.out.print("Introduce otro numero: ");
		int valor1 = entrada.nextInt();
		if (valor < valor1) {
			System.out.print(valor1 + " es mayor que " + valor);
		} else {
			System.out.print(valor1 + " no es mayor que " + valor);
		}	
		
	}
	
	/*public void anidado() {
		// TODO Auto-generated method stub
		System.out.print("Introduce un numero: ");
		int valor2 = entrada.nextInt();
		System.out.print("Introduce otro numero: ");
		int valor3 = entrada.nextInt();
		
		
		if (valor < valor1) {
			System.out.print(valor1 + " es mayor que " + valor);
		} else if {
			System.out.print(valor1 + " no es mayor que " + valor);
		}	else {
			
		}
		
	}*/
	
	public void anidado() {
		// TODO Auto-generated method stub
		System.out.print("Introduce un numero: ");
		int valor2 = entrada.nextInt();
		if (valor2 > 0) {
			System.out.print(valor2 + " es Positivo");
		} else if (valor2 < 0){
			System.out.print(valor2 + " es Negativo");
		}	else {
			System.out.print(valor2 + " es Neutro");
		}
		
	}
	
	
}
