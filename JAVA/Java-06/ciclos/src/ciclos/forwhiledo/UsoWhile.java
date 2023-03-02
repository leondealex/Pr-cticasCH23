package ciclos.forwhiledo;

import java.util.Scanner;

public class UsoWhile {
	Scanner entrada = new Scanner(System.in);
	public void cicloW() {
		// TODO Auto-generated method stub
			int iterador = 0;
			while (iterador < 10) {
				System.out.println("Iterador " + iterador);
				iterador = iterador + 1;
			}
		
		
	}
	public void centinelaW() {
		final int centinela = -1;
		System.out.println("Introduzca una nota");
		int nota = entrada.nextInt();
		while (nota!= centinela) {
			System.out.println("La nota es: " + nota);
			System.out.println("Introduzca una nota");
			nota = entrada.nextInt();
		}
		System.out.println("Fin");
	}
	
	public void banderaW() {
		boolean valorB = false;
		while (!valorB) {
			System.out.print("Introduzca un valor numerico: ");
			int valorX = entrada.nextInt();
			if (valorX > 0 && valorX < 5) {
				int potaxio = (int) Math.pow(valorX, 2);
				System.out.println("El resultado --> " + potaxio);
			} else {
				valorB = true;
				System.out.println("Adios");
			}
		
		}

	}

}
