package ejrcicio_1;

public class CartaEspecial extends Carta implements Accionable {

    public CartaEspecial(int valor, String palo) {
        super(valor, palo);
    }

    @Override
    public void jugar() {
        System.out.println("La carta especial ha sido jugada.");
    }

    @Override
    public void realizarAccion() {
        System.out.println("La carta especial realiza una acción especial.");
    }
}
