package colecciones.aala;

import java.util.*;


public class MisColecciones {

	public static void main(String[] args) {
		MisColecciones c = new MisColecciones();
		//imprimir(c.listasCollections());
		//imprimir(c.setCollection());
		// wrapperClass();
		//imprimir(Collection) c.mapCollection();
		mapCollection();
		
		
	}
	
	
	
	private static void mapCollection() {
		Map miMap = new HashMap();	
		miMap.put("valor1", "Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Karla");
	
		
		miMap.remove("valor3");
		imprimir(miMap.keySet());
		//miMap.clear();
		imprimir(miMap.values());
		
		
		//return miMap;

	}
	
		Set setCollection() {
		Set miSet = new HashSet();
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cuatro");
		//miSet.clear();
		
		miSet.remove("uno");
		System.out.println(miSet.size());
		
		return miSet;

	}
	
		
		
	private List listasCollections() {
		
		List miLista = new ArrayList();
		System.out.println(miLista + " Tamaño de la lista " + miLista.size());
		System.out.println("Está vacía " + miLista.isEmpty());
		miLista.add("1");
		miLista.add(0,2);
		miLista.add(3);
		miLista.add(0,"Pato");
		miLista.set(0, miLista);
		miLista.remove(2);
		
		System.out.println(miLista + " Tamaño de la lista " + miLista.size());
		System.out.println("Está vacía " + miLista.isEmpty());
		
		boolean e = miLista.contains(3);
		System.out.println("--> " + e);
		
		return miLista;

	}
	
	//metodo imprimir
	private static void imprimir(Collection collection) {
		for (Object elementos : collection) {
			System.out.println("Elementos " + elementos);
		}

	}
	
	
	
	static void wrapperClass() {
	//byte, short, char, long, float, double, int
		
		byte numeroB = -128;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor Max " + Byte.MAX_VALUE);
		System.out.println("Valor Min " + Byte.MIN_VALUE);
		System.out.println("--> " + numeroB);
		
		int numeroI = 2147483647;
		System.out.println("Tamaño de un entero: " + Integer.BYTES);
		System.out.println("Tamaño de un entero: " + Integer.SIZE);
		System.out.println("Valor Max entero: " + Integer.MAX_VALUE);
		System.out.println("Valor Min entero: " + Integer.MIN_VALUE);
		System.out.println("--> " + numeroI);
		
		System.out.println("Tamaño de un short: " + Short.BYTES);
		System.out.println("Tamaño de un long: " + Long.BYTES);
		System.out.println("Tamaño de un float: " + Float.BYTES);
		System.out.println("Tamaño de un double: " + Double.BYTES);
		
	}
	
	
	
	
	
	
	
	
	
	

}
