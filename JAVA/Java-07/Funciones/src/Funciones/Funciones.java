package Funciones;

public class Funciones { // Clase llamada Funciones

	// Funcion que usa Strings como argumentos
	public static String awitaDeLimon(String ingrediente1, String ingrediente2, String ingrediente3) {
		String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3;
		return recetaCompletada;
	}// Ciere suma Strings
	
	// Las funciones se pueden declarar en cualquier lugaar de la clase (si retorna
	// algo)
	public static int sumar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;

	}// Cierre de sumar

	public static int restar(int rest1, int rest2) {
		int resultado = rest1 - rest2;
		return resultado;

	}// Cierre de restar

	public static float dividir(float div1, float div2) {
		float resultado = div1 / div2;
		return resultado;

	}// Cierre de dividir

	public static int multiplicar(int mult1, int mult2) {
		int resultado = mult1 * mult2;
		return resultado;

	}// Cierre de multiplicar

	public static float sumaDecimal(float sum1, int sum2) {
		float resultadoDecimal = sum1 + sum2;
		return resultadoDecimal;

	}// Cierre de suma decimal

	// Funcion para imprimir asteriscos (void)
	public static void imprimirAsteriscos() {
		System.out.println("************************************");
	}// Cierre de imprimir asteriscos

	// Este metodo tiene como funcion, ejecutar coasas
	public static void main(String[] args) {

		// Las invocaciones de la funcion se hacen generalmente dentro del
		// metodo principal o main
		System.out.println("El resultado de la suma es: " + sumar(50, 8));

		System.out.println("El resultado de la resta es: " + restar(50, 8));

		System.out.println("El resultado de la divisiom es: " + dividir(50, 8));

		System.out.println("El resultado de la multiplicacion es: " + multiplicar(50, 8));

		System.out.println("El resultado de la suma decimal es: " + sumaDecimal(5.7f, 5));

		imprimirAsteriscos();
		imprimirAsteriscos();
		imprimirAsteriscos();

		System.out.println("Los ingredientes para el agua de limon son: " + awitaDeLimon("agua ", "limon ", "azucar "));

		//Funcion de la biblioteca de matematicas (Math)
		double valorEjemplo = 5;
		
		System.out.println("La raiz cuadrada de mi valor Ejemplo: " + Math.sqrt(valorEjemplo));
		
		System.out.println("El seno de mi valor es: " + Math.sin(valorEjemplo));
		
		System.out.println("La potencia de mi valor es: " + Math.pow(valorEjemplo, 2));
		
		
	}// Cierre de metodo main

}// Cierre de clase funciones





/*
 * - Sintaxis de las funciones que si retornan valores tipoDeRetorno
 * nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) { //
 * Cuerpo de la función }
 * 
 * 
 * 
 * 
 * 
 * - Sintaxis de las funciones que no retornan valores palabraReservada
 * nombreDeLaFuncion(){ //cuerpo de la funcion }
 * 
 * 
 * 
 * 
 * 
 * Cosas que debemos tomar en cuenta al momento de crear nuestras funciones: -
 * Deben de llevar un nombre unico - Opcionalmente podran recibir argumentos y
 * devolver el resultado - Se debe especificar el tipo de dato que vamos a pasar
 * como argumnto, y el resultado final de nuestra funcion - Cuidar el orden en
 * como estamos agregando nuestros parametros o argumentos.
 */




/*
 * Funcipones - No retornan valores: no devuelven nada, no se especifica nada y
 * no usamos la palabra return.
 * 
 * - Si retornan valores: Se especifica el tipo de dato, el tipo de valor que
 * regresa y se usa return.
 * 
 */



