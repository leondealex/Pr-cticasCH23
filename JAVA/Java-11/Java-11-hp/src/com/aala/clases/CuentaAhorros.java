package com.aala.clases;

public class CuentaAhorros extends Cuenta {
    private boolean cuentaActiva;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo >= 10000) {
            this.cuentaActiva = true;
        } else {
            this.cuentaActiva = false;
        }
    }

    @Override
    public void consignar(float cantidad) {
        if (this.cuentaActiva) {
            super.consignar(cantidad);
        } else {
            System.out.println("No se pueden realizar consignaciones en una cuenta inactiva.");
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (this.cuentaActiva) {
            super.retirar(cantidad);
        } else {
            System.out.println("No se pueden realizar retiros en una cuenta inactiva.");
        }
    }

    @Override
    public void extractoMensual() {
        if (this.numRetiros > 4) {
            this.comisionMensual += 1000 * (this.numRetiros - 4);
        }
        if (this.saldo < 10000) {
            this.cuentaActiva = false;
        } else {
            this.cuentaActiva = true;
        }
        super.extractoMensual();
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Estado de la cuenta: " + (this.cuentaActiva ? "Activa" : "Inactiva"));
        System.out.println("Comisión mensual: " + this.comisionMensual);
        System.out.println("Número de transacciones: " + (this.numConsignaciones + this.numRetiros));
    }

	public String getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getComisionMensual() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumTransacciones() {
		// TODO Auto-generated method stub
		return null;
	}
}
