package com.aala.clases;

public class CuentaCorriente extends Cuenta {
    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual, float sobregiro) {
        super(saldo, tasaAnual);
        this.sobregiro = sobregiro;
    }

    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad > saldo + sobregiro) {
            System.out.println("No se puede retirar esa cantidad, sobrepasa el límite de sobregiro");
        } else if (cantidad <= saldo) {
            saldo -= cantidad;
            numRetiros++;
        } else {
            sobregiro -= cantidad - saldo;
            saldo = 0;
            numRetiros++;
        }
    }

    @Override
    public void consignar(float cantidad) {
        super.consignar(cantidad);
        if (sobregiro < 0) {
            sobregiro += cantidad;
        }
    }

    @Override
    public void extractoMensual() {
        float comision = 0;
        if (numRetiros > 4) {
            comision = (numRetiros - 4) * 1000;
        }
        saldo -= comision;
        calcularInteresMensual();
        saldo -= comision;
        System.out.println("Extracto mensual:\n"
                + "Saldo: $" + saldo + "\n"
                + "Comisión mensual: $" + comision + "\n"
                + "Número de transacciones: " + (numConsignaciones + numRetiros) + "\n"
                + "Sobregiro: $" + sobregiro);
    }

    @Override
    public void imprimir() {
        System.out.println("Cuenta corriente:\n"
                + "Saldo: $" + saldo + "\n"
                + "Comisión mensual: $" + comisionMensual + "\n"
                + "Número de transacciones: " + (numConsignaciones + numRetiros) + "\n"
                + "Sobregiro: $" + sobregiro);
    }
}
