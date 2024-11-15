package ejrcicio_2;

public class MainCarreras {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 180);
        Moto moto = new Moto("Yamaha", "R1", 220);

        coche.mostrarInfo();
        coche.acelerar();

        moto.mostrarInfo();
        moto.acelerar();
        moto.activarTurbo();
    }
}
