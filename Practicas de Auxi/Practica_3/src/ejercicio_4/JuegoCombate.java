package ejercicio_4;

public class JuegoCombate {
    public static void main(String[] args) {
        Random random = new Random();
        Mago mago = new Mago("Gandalf", random.nextInt(50), 100, 50);
        Guerrero guerrero = new Guerrero("Aragorn", random.nextInt(50), 100, 70);

        while (mago.getPuntosDeVida() > 0 && guerrero.getPuntosDeVida() > 0) {
            int dañoMago = random.nextInt(11) + 10;
            int dañoGuerrero = random.nextInt(11) + 10;

            mago.lanzarHechizo();
            guerrero.recibirDaño(dañoMago);
            mago.mostrarEstado();
            guerrero.mostrarEstado();

            if (guerrero.getPuntosDeVida() <= 0) {
                System.out.println("El mago ha ganado.");
                break;
            }

            guerrero.atacar();
            mago.recibirDaño(dañoGuerrero);
            mago.mostrarEstado();
            guerrero.mostrarEstado();

            if (mago.getPuntosDeVida() <= 0) {
                System.out.println("El guerrero ha ganado.");
                break;
            }
        }
    }
}
