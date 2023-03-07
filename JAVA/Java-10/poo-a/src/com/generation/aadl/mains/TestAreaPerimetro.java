package com.generation.aadl.mains;

import com.generation.aadl.clases.AreaPerimetro;
import com.generation.aadl.clases.FigurasGeometricas;

public class TestAreaPerimetro {

	public static void main(String[] args) {
		AreaPerimetro ap = new AreaPerimetro();
		FigurasGeometricas fg = new FigurasGeometricas();
		
		fg.setArea(ap.area(8));
		System.out.println("Area de cuadrado--> " + fg.getArea());
		
		fg.setPerimetro(ap.perimetro(5));
		System.out.println("Perimetro del cuadrado--> " + fg.getPerimetro());
		
		fg.setAreaCirculo(ap.areaCirculo(3.14159, 7));
		System.out.println("El area del circulo--> " + fg.getAreaCirculo());
		
	}

}
