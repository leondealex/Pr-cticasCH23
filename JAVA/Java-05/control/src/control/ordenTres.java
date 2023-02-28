package control;

import java.util.Arrays;
import java.util.Scanner;

public class ordenTres {
	
	Scanner dato = new Scanner(System.in);
	
	public void ordenar() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el primer numero :");
		int num1 = dato.nextInt();
		System.out.println("Ingrese el segundo numero :");
		int num2 = dato.nextInt();
		System.out.println("Ingrese el tercer numero :");
		int num3 = dato.nextInt();
		
		int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);

        System.out.println("Los números ordenados en orden ascendente son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
		
	}

}
}
