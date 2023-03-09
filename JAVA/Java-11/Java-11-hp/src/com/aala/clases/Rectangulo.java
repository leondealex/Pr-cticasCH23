package com.aala.clases;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas {
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		super("Rectangulo");
		this.base = base;
		this.altura = altura;
	}


	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return base * altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public void pedirDatos() {
		Scanner datos = new Scanner(System.in);
		System.out.print("Introduzca la base: ");
		
		double b = datos.nextDouble();
		this.setBase(b);
		
		System.out.print("Introduzca la altura: ");
		this.setAltura(datos.nextDouble());
	}
	
	

}
