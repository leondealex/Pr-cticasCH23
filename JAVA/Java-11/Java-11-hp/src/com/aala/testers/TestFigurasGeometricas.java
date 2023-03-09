package com.aala.testers;

import com.aala.clases.*;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		FigurasGeometricas rectangulo = new Rectangulo(6,4);
		FigurasGeometricas circulo = new Circulo(2);
		//FigurasGeometricas triangulo = new Triangulo(4,4);
		//FigurasGeometricas cuadrado = new Cuadrado(4,4);
		System.out.println("El area del rectangulo es "+ rectangulo.areas());
		System.out.println("El area del circulo es " + circulo.areas());
		
		//System.out.println("El area del triangulo: " + triangulo.areas());
		//System.out.println("El area del cuadrado: " + cuadrado.areas());
		System.out.println(rectangulo.toString());
		System.out.println(circulo.toString());
		
		rectangulo.pedirDatos();
		System.out.println(rectangulo.toString());
		System.out.println(rectangulo.areas());
	}

}
