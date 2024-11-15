package ejrcicio_1;

public class CartaNormal extends Carta {

    public CartaNormal(int valor, String palo) {
        super(valor, palo);
    }

    @Override
    public void jugar() {
        System.out.println("La carta normal ha sido jugada.");
    }
}

