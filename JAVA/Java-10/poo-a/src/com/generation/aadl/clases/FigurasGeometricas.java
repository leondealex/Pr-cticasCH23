package com.generation.aadl.clases;

public class FigurasGeometricas {
	private double perimetro;
	private double area;
	private double areaCirculo;

	public FigurasGeometricas() {

	}

	public FigurasGeometricas(double perimetro, double area) {

		this.perimetro = perimetro;
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getAreaCirculo() {
		return areaCirculo;
	}
	
	public void setAreaCirculo(double areaCirculo) {
		this.areaCirculo = areaCirculo;
		
	}
	
	
	

}
