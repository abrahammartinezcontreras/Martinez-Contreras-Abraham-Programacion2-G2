package com.ejemplo.cuenta;

public class CuentaConLimite extends Cuenta {
    private double limite;

    public CuentaConLimite(double saldoInicial) {
        super(saldoInicial);
        this.limite = saldoInicial / 2; // Inicialmente el límite es la mitad del saldo inicial
    }

    @Override
    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo && monto <= limite) {
            saldo -= monto;
            System.out.println("Extracción: " + monto + ", Nuevo saldo: " + saldo + ", Límite: " + limite);
        } else {
            System.out.println("Monto de extracción no válido, saldo insuficiente o excede el límite.");
        }
    }

    public void ajustarLimite() {
        limite = saldo / 2;
        System.out.println("Nuevo límite ajustado a: " + limite);
    }
}
