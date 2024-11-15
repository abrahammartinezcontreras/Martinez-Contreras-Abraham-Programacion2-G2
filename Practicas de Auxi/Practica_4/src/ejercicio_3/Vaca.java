package ejercicio_3;

public class Vaca extends Animal implements Productor {

    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La vaca está mugiendo.");
    }

    @Override
    public void producir() {
        System.out.println("La vaca está produciendo leche.");
    }
}

