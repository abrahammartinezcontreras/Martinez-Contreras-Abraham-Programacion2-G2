public class MainEvento {
    public static void main(String[] args) {
        Evento evento = new Evento("Torneo de Invierno");

        evento.registrarNotificacion(mensaje -> System.out.println("Notificación 1: " + mensaje));
        evento.registrarNotificacion(mensaje -> System.out.println("Notificación 2: " + mensaje));

        evento.activar();
    }
}
