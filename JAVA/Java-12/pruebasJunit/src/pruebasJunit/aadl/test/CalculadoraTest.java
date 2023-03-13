package pruebasJunit.aadl.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import pruebasJunit.aadl.app.Calculadora;


class Calculadora_Test {
	//creamos la instancia
private Calculadora ct;
private Calculadora ct1;

	@BeforeEach
	public void configurandoBefore() {
		//ct ya no es null, instancia global
		ct = new Calculadora();
		System.out.println("Ejecutando Before ==> configurandoBefore()");
		
	}
	
	@AfterEach
	public void configurandoAfter() {
		ct=null;
		System.out.println("Ejecutando AfterEach ==> configurandoAfter()");
		System.out.println("---------");
	}
		
	@Test
	public void calculadoraNull() {
		
		assertNull(ct1, "La clase es una instancia no nula");
		System.out.println("Ejecutando el primer test --> Calculadora");
	}
	@Test
	public void calculadoraNotNull() {

		assertNotNull(ct);
		System.out.println("Ejecutando el segundo test --> Calculadora");
	}
	
	
	/*****PRIMERAS PRUEBAS*****/
	@Test	
	public void primerosAssert() {
		/*
		 * 1.- Indicar que se va a evaluar
		 * 2.- Indicar lo que se va a realizar
		 * 3.- Evaluar con el assert indicado
		 */
		//1.-declarado en beforeEach
		//2.-
		int resultadoEsperado = 10;
		int resultadoActual;
		resultadoActual = ct.sumar(6,4);
		//3.-
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando tercer test ==> primerosAssert()");
	
	}
	
	@Test
	//lo de arriba pero simplificado
	public void sumaTest() {
		Calculadora calculadora = new Calculadora();
		assertEquals(20, calculadora.sumar(10, 10));
		System.out.println("Ejecutando cuart0 test ==> sumaTest()");
	}
	
	/*****TIPOS DE TEST*****/
	
	@Test
	public void tiposdeAsserts() {

		assertNull(ct1);
		assertTrue(2==2);
		assertEquals("Generation", "Generation");
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = c1;
		assertSame(c1, c3);
		assertNotSame(c2, c3);
		//tolerancia de .5
		assertEquals(1, 1.3, .5);
		
	}
	@Test
	public void validandoSuma() {
		assertEquals(11, ct.sumar(5, 6));
		
	}
	@Test
	public void validandoResta() {
		assertEquals(1, ct.restar(7, 6));
		
	}
	@Test
	public void validandoRestaNegativa() {

		assertEquals(-10, ct.restar(10, 20));
	}
	@Test
	public void validandoDivision() {
		
		assertEquals(2, ct.div(10, 5));
	}
	/*
	@Test
	public void validandoByZero() {
		assertThrows(ArithmeticException.class, ()->ct.divByZero(10, 1), 
				"debe dividir por cero");
				
	}*/
	
	@Disabled ("En espera")
	@Test
	public void validandoByZero() {
		assertThrows(ArithmeticException.class, ()->ct.divByZero(10, 1), 
				"debe dividir por cero");

	}
}