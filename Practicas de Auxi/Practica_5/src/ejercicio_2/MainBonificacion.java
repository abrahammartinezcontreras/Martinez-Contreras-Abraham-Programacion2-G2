package ejercicio_2;

public class MainBonificacion {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Alice", 100);
        Jugador jugador2 = new Jugador("Bob", 150);

        CalculadoraBonificacion bonificacionDoble = puntosBase -> puntosBase * 2;
        CalculadoraBonificacion bonificacionDiez = puntosBase -> 10;

        jugador1.aplicarBonificacion(bonificacionDoble);
        jugador2.aplicarBonificacion(bonificacionDiez);

        jugador1.mostrarPuntos();
        jugador2.mostrarPuntos();
    }
}
