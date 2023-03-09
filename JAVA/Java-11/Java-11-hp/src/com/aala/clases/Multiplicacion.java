package com.aala.clases;

public class Multiplicacion implements OperacionesAritmeticas, Mensajes {
    private double a;
    private double b;
    
    public Multiplicacion() {
    }
    
    public Multiplicacion(double a, double b) {
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
        return 0;
    }
    
    @Override
    public double multiplicar() {
        return this.a * this.b;
    }
    
    @Override
    public double dividir() {
        return 0;
    }
    
    @Override
    public void mensaje() {
        System.out.println("Hola, soy una multiplicación.");
    }
}