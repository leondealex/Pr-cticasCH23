package com.aala.testers;

import com.aala.clases.CuentaAhorros;
import java.util.Scanner;


public class TestCuenta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");

        // Ingresar saldo inicial y tasa de interes
        System.out.print("Ingrese saldo inicial= $");
        float saldo = scanner.nextFloat();
        System.out.print("Ingrese tasa de interés= ");
        float tasaAnual = scanner.nextFloat();

        // Crear objeto cuenta de ahorros
        CuentaAhorros cuentaDeAhorros = new CuentaAhorros(saldo, tasaAnual);

        // Consignar y retirar dinero
        System.out.print("Ingresar cantidad a consignar: $");
        float cantidadConsignar = scanner.nextFloat();
        cuentaDeAhorros.consignar(cantidadConsignar);

        System.out.print("Ingresar cantidad a retirar: $");
        float cantidadRetirar = scanner.nextFloat();
        cuentaDeAhorros.retirar(cantidadRetirar);

        // Imprimir saldo, comision mensual y numero de transacciones
        System.out.println("Saldo = $" + cuentaDeAhorros.getSaldo());
        System.out.println("Comisión Mensual = $" + cuentaDeAhorros.getComisionMensual());
        System.out.println("Número de transacciones = " + cuentaDeAhorros.getNumTransacciones());
    }
}
