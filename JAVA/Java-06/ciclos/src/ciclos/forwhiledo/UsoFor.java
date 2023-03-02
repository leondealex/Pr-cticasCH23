package ciclos.forwhiledo;

import java.util.Iterator;

public class UsoFor {
	public void cicloFor() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("el iterador --> " + i);
		}

	}
	
	public void LetrasFor() {
		System.out.println("For con letras");
		for (int i = 'A'; i <= 'Z'; i++) {
			//System.out.print("Soy --> " + i + ", ");
			char letra = (char) i;
			System.out.println("Soy --> " + letra + ", ");
		}
		
	}

}
