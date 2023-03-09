package com.aala.testers;

import com.aala.clases.Division;
import com.aala.clases.Mensajes;
import com.aala.clases.Multiplicacion;
import com.aala.clases.OperacionesAritmeticas;
import com.aala.clases.Suma;
import com.aala.clases.Resta;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		Suma s = new Suma(5,2);
		OperacionesAritmeticas ss = new Suma(10,3);
		Mensajes sss = new Suma();
		Resta r = new Resta(5,2);
		Multiplicacion m = new Multiplicacion(5,2);
		Division d = new Division(5,2);
		
		System.out.println("Suma " + s.sumar());
		System.out.println("Operaciones Aritmeticas " + ss.sumar());
		System.out.println("Resta " + r.restar());
		System.out.println("Multiplicación " + m.multiplicar());
		System.out.println("División " + d.dividir());
		s.mensaje();
		sss.mensaje();
		m.mensaje();
		d.mensaje();
	}

}



