package ejrcicio_2;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;
    protected int combustible; // Atributo extra

    public Vehiculo(String marca, String modelo, int velocidadMaxima, int combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.combustible = combustible; // Inicializar atributo extra
    }

    public abstract void acelerar();

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Velocidad Máxima: " + velocidadMaxima + ", Combustible: " + combustible + " litros");
    }

    public void reabastecer(int litros) {
        combustible += litros; // Método extra
        System.out.println("El vehículo ha sido reabastecido con " + litros + " litros de combustible.");
    }
}

public class Moto extends Vehiculo implements Turbo {

    public Moto(String marca, String modelo, int velocidadMaxima, int combustible) {
        super(marca, modelo, velocidadMaxima, combustible);
    }

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando.");
    }

    @Override
    public void activarTurbo() {
        System.out.println("La moto ha activado el turbo.");
    }
}


