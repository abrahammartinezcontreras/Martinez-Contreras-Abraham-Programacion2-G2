package ejercicio_3;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int nivel, int puntosDeVida, int mana) {
        super(nombre, nivel, puntosDeVida);
        this.mana = mana;
    }

    public void lanzarHechizo() {
        System.out.println("El mago ha lanzado un hechizo.");
    }
}

public class Arquero extends Personaje {
    private int destreza;

    public Arquero(String nombre, int nivel, int puntosDeVida, int destreza) {
        super(nombre, nivel, puntosDeVida);
        this.destreza = destreza;
    }

    public void dispararFlecha() {
        System.out.println("El arquero ha disparado una flecha.");
    }
}

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosDeVida, int fuerza) {
        super(nombre, nivel, puntosDeVida);
        this.fuerza = fuerza;
    }

    public void atacar() {
        System.out.println("El guerrero ha realizado un ataque.");
    }
}

