package control;

import java.util.Scanner;

public class EstructuraMultiple {

	Scanner dato = new Scanner(System.in);

	public void vocal() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un caracter");
		char letra = dato.next().charAt(0);
		switch (letra) {
		case 'a':
		case 'A':
		case 'e':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(letra + " es vocal");
			break;

		default:
			System.out.println(letra + " no es vocal");
			break;
		}

	}

	public void notas() {
		// TODO Auto-generated method stub
		System.out.print("Introduzca la nota: ");
		int nota = dato.nextInt();
		switch (nota) {
		case 10:
			System.out.print("Excelente");
			break;
		case 9:
			System.out.print("Muy bien");
			break;
		case 8:
			System.out.print("Bueno");
			break;
		case 7:
			System.out.print("Regular");
			break;
		case 6:
			System.out.print("Deficiente");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Reprobado");

			System.out.println();
			break;

		default:
			System.out.println("Fuera de rango");
			break;
		}

	}

	public void ternario() {
		// TODO Auto-generated method stub
		System.out.print("Introduzca un valor numerico :");
		int entradaV = dato.nextInt();
		System.out.print("Introduzca un segundo valor numerico: ");
		int entradaF = dato.nextInt();
		int menor =(entradaV <= entradaF) ? entradaV : entradaF;
		System.out.println("---> " + menor);

	}

}
