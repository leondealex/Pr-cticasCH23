package tiposDeDatosYVariables;

public class Java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) {
		    System.out.println("Puede conducir un coche");
		} else {
		    System.out.println("No puede conducir un coche");
		}
		
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) {
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		boolean esVerdadero = true;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}
		
		//Verificar si un número es par y positivo:
		
			int num5 = 6;
			if (num5 % 2 == 0 && num5 > 0) {
				System.out.println("Es numero par y positivo");
			} else {
				System.out.println("No se cumplen ambas condiciones");
			}
		
			

		//Verificar si un número está dentro de un rango específico:
			
			int num6 = 10;
			if (num6 >= 10 && num6 < 20) {
				System.out.println("Está dentro del rango 10 a 20");
			} else {
				System.out.println("No está dentro del rango");
			}
			

		//Verificar si una cadena es igual a otra o no:
			
			String cadena1 = "Hola";
			String cadena2 = "hola";
		
		if (cadena1 == cadena2) {
			System.out.println("Son iguales");
			} else {
				System.out.println("No son iguales");
		}
		
	}
	
	
}

