package Complejos;

public class Complejo {
    private double real;
    private double imaginario;

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    // Suma de números complejos
    public Complejo sumar(Complejo otro) {
        return new Complejo(this.real + otro.real, this.imaginario + otro.imaginario);
    }

    // Resta de números complejos
    public Complejo restar(Complejo otro) {
        return new Complejo(this.real - otro.real, this.imaginario - otro.imaginario);
    }

    // Multiplicación de números complejos
    public Complejo multiplicar(Complejo otro) {
        double nuevoReal = this.real * otro.real - this.imaginario * otro.imaginario;
        double nuevoImaginario = this.real * otro.imaginario + this.imaginario * otro.real;
        return new Complejo(nuevoReal, nuevoImaginario);
    }

    // División de números complejos
    public Complejo dividir(Complejo otro) {
        double denominador = otro.real * otro.real + otro.imaginario * otro.imaginario;
        double nuevoReal = (this.real * otro.real + this.imaginario * otro.imaginario) / denominador;
        double nuevoImaginario = (this.imaginario * otro.real - this.real * otro.imaginario) / denominador;
        return new Complejo(nuevoReal, nuevoImaginario);
    }

    // Operaciones escalares
    public Complejo escalarSumar(double escalar) {
        return new Complejo(this.real + escalar, this.imaginario + escalar);
    }

    public Complejo escalarRestar(double escalar) {
        return new Complejo(this.real - escalar, this.imaginario - escalar);
    }

    public Complejo escalarMultiplicar(double escalar) {
        return new Complejo(this.real * escalar, this.imaginario * escalar);
    }

    @Override
    public String toString() {
        return this.real + " + " + this.imaginario + "i";
    }

    public static void main(String[] args) {
        Complejo a = new Complejo(1, 2);
        Complejo b = new Complejo(3, 4);

        System.out.println("Suma: " + a.sumar(b));
        System.out.println("Resta: " + a.restar(b));
        System.out.println("Multiplicación: " + a.multiplicar(b));
        System.out.println("División: " + a.dividir(b));

        System.out.println("Escalar Suma: " + a.escalarSumar(2));
        System.out.println("Escalar Resta: " + a.escalarRestar(2));
        System.out.println("Escalar Multiplicación: " + a.escalarMultiplicar(2));
    }
}