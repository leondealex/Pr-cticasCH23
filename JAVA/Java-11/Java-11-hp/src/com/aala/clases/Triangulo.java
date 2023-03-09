package com.aala.clases;

public class Triangulo extends FigurasGeometricas {
	private int base;
	private int altura;
	
	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return (base * altura)/2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	
	

}
