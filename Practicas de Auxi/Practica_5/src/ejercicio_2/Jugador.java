package ejercicio_2;

public class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public void aplicarBonificacion(CalculadoraBonificacion calculadora) {
        puntos += calculadora.calcular(puntos);
    }

    public void mostrarPuntos() {
        System.out.println("Jugador: " + nombre + ", Puntos: " + puntos);
    }
}
