package com.aala.testers;

import com.aala.clases.AlumnoB;
import com.aala.clases.PersonaP;

public class TestPB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlumnoB a = new AlumnoB(123,8.5,"Armando",20);
		PersonaP b = new PersonaP("María", 18);
		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.toString());
		System.out.println(b.toString());
		a.mostrarDatos();
		a.mostrarDatos("Lara");
		
		
	}

}
