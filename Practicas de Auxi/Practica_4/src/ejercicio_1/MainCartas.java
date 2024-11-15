package ejrcicio_1;

public class MainCartas {
    public static void main(String[] args) {
        CartaNormal cartaNormal = new CartaNormal(5, "Corazones");
        CartaEspecial cartaEspecial = new CartaEspecial(10, "Diamantes");

        cartaNormal.mostrarCarta();
        cartaNormal.jugar();

        cartaEspecial.mostrarCarta();
        cartaEspecial.jugar();
        cartaEspecial.realizarAccion();
    }
}
