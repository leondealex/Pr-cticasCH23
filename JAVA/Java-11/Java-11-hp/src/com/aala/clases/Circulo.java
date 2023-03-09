package com.aala.clases;

public class Circulo extends FigurasGeometricas {
	private int radio;
	
	
	public Circulo(int radio) {
		super("Circulo");
		this.radio = radio;
	}


	@Override
	public double areas() {
		return Math.PI * Math.pow(radio, radio);
	}


	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	}


	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}
	
	

}
