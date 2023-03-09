package com.aala.clases;

public class Division implements OperacionesAritmeticas, Mensajes {
    private double a;
    private double b;
    
    public Division() {
    }
    
    public Division(double a, double b) {
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
        return 0;
    }
    
    @Override
    public double dividir() {
        return this.a / this.b;
    }
    
    @Override
    public void mensaje() {
        System.out.println("Hola, soy una división.");
    }
}