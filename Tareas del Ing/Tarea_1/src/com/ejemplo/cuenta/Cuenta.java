package com.ejemplo.cuenta;

public class Cuenta {
    protected double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void ingresar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Ingreso: " + monto + ", Nuevo saldo: " + saldo);
        } else {
            System.out.println("Monto de ingreso no válido.");
        }
    }

    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Extracción: " + monto + ", Nuevo saldo: " + saldo);
        } else {
            System.out.println("Monto de extracción no válido o saldo insuficiente.");
        }
    }

    public double recuperarSaldo() {
        return saldo;
    }
}
