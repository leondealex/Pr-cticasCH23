package pruebasJunit.aadl.app;

public class Calculadora {
	
	
	public int sumar(int n1, int n2) {

		return (n1+n2);
	}
	
	public int restar(int n1, int n2) {

		return (n1-n2);
	}
	
	public double multi(double n1, double n2) {

		return (n1*n2);
	}
	
	public double div(double n1, double n2) {

		return (n1/n2);
	}
	
	public double divByZero(double v1, double v2) {
		if (v2 == 0) {
			throw new ArithmeticException("No se puede dividir por cero");
		}
		return (v1/v2);
	}
	
}





public class Prueba {
	
	public static void main (String[]args) {
		int x=10;
		
		while (x<10) {
			System.out.println(x);
			x++;
		}
	}
	
	
	
	
	
}