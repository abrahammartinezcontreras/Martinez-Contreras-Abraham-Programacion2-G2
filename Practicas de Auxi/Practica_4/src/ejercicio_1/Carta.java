package ejrcicio_1;

public abstract class Carta {
    protected int valor;
    protected String palo;
    protected String color; // Atributo extra

    public Carta(int valor, String palo, String color) {
        this.valor = valor;
        this.palo = palo;
        this.color = color; // Inicializar atributo extra
    }

    public abstract void jugar();

    public void mostrarCarta() {
        System.out.println("Carta: " + valor + " de " + palo + " (" + color + ")");
    }
}

public class CartaEspecial extends Carta implements Accionable {

    public CartaEspecial(int valor, String palo, String color) {
        super(valor, palo, color);
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


