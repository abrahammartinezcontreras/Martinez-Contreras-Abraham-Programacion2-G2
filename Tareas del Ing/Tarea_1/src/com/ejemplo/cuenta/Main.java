package com.ejemplo.cuenta;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1000);
        cuenta.ingresar(200);
        cuenta.extraer(150);
        System.out.println("Saldo actual: " + cuenta.recuperarSaldo());

        CuentaConLimite cuentaConLimite = new CuentaConLimite(1000);
        cuentaConLimite.ingresar(200);
        cuentaConLimite.extraer(150);
        cuentaConLimite.ajustarLimite();
        cuentaConLimite.extraer(600); // Excede el nuevo límite
        cuentaConLimite.extraer(400); // Dentro del nuevo límite
        System.out.println("Saldo actual: " + cuentaConLimite.recuperarSaldo());
    }
}
