package com.aala.clases;

import java.util.Scanner;

public abstract class Cuadrado extends FigurasGeometricas{
	private int lado;
	
	public Cuadrado(int base, int altura) {
		super("Cuadrado");
		this.base = base;
		this.lado = lado;;
	}

	@Override
	public double areas() {
		return base * altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(double b) {
		this.base = b;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(double d) {
		this.altura = d;
	}
	
	
	
	
	

}
