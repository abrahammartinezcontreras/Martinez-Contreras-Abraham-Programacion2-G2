public class MainAventura {
    public static void main(String[] args) {
        Aventura aventura = new Aventura();

        aventura.agregarTarea(() -> System.out.println("Tarea 1: Explorar el bosque"));
        aventura.agregarTarea(() -> System.out.println("Tarea 2: Recoger hierbas medicinales"));

        aventura.iniciar();
    }
}
