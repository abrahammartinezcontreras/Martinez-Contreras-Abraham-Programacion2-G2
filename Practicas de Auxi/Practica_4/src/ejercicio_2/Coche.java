package ejrcicio_2;

public class Coche extends Vehiculo {

    public Coche(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }
}
