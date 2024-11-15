package ejercicio_7;

public class MiniJuego {
    public static void main(String[] args) {
        Mago mago = new Mago("Gandalf", 10, 100, 50);
        Guerrero guerrero = new Guerrero("Aragorn", 15, 100, 70);
        Zombie zombie = new Zombie("Zombie", 80, 10);
        Vampiro vampiro = new Vampiro("Drácula", 90, 12);
        Jefe jefe = new Jefe("Sauron", 150, 20, 1.5);

        // Ejemplo de interacción
        mago.lanzarHechizo();
        guerrero.atacar();
        zombie.atacar();
        vampiro.atacar();
        jefe.hablar();
        jefe.ataqueCritico();
    }
}

