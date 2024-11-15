package ejercicio_1;

public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosDeVida;

    public Personaje(String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + ", Nivel: " + nivel + ", Puntos de Vida: " + puntosDeVida);
    }

    public void recibirDaño(int daño) {
        puntosDeVida -= daño;
    }

    public void curar() {
        puntosDeVida += 20;
    }
}
