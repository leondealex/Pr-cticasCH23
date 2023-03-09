package com.aala.clases;

public class Resta implements OperacionesAritmeticas, Mensajes {
    private double a;
    private double b;
    
    public Resta() {
    }
    
    public Resta(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double sumar() {
        return 0;
    }
    
    @Override
    public double restar() {
        return this.a - this.b;
    }
    
    @Override
    public void mensaje() {
        System.out.println("Hola, soy una resta.");
    }

	@Override
	public double multiplicar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double dividir() {
		// TODO Auto-generated method stub
		return 0;
	}
}
