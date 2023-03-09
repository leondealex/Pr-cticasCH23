package com.aala.clases;

public class Cuenta {
    protected float saldo;
    protected int numConsignaciones;
    protected int numRetiros;
    protected float tasaAnual;
    protected float comisionMensual;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        this.saldo += cantidad;
        this.numConsignaciones++;
    }

    public void retirar(float cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            this.numRetiros++;
        } else {
            System.out.println("No se puede retirar más dinero del disponible.");
        }
    }

    public void calcularInteresMensual() {
        float interesMensual = (this.saldo * (this.tasaAnual / 100)) / 12;
        this.saldo += interesMensual;
    }

    public void extractoMensual() {
        this.calcularInteresMensual();
        this.saldo -= this.comisionMensual;
    }

    public void imprimir() {
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Número de consignaciones: " + this.numConsignaciones);
        System.out.println("Número de retiros: " + this.numRetiros);
        System.out.println("Tasa anual: " + this.tasaAnual);
        System.out.println("Comisión mensual: " + this.comisionMensual);
    }
}

