package hilos.aadl.pruebas;

import hilos.aadl.formarunnable.Hilo2;

public class TestRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo2 ht = new Hilo2("Pedro");
		Thread st = new Thread(ht);
		st.start();
		
		new Thread(new Hilo2("Caligula")).start();
		new Thread(new Hilo2("Mariano")).start();
		
	}

}
