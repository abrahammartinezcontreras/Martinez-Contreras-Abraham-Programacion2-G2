package ejercicio_5;

public class Enemigo {
    private String nombre;
    private int puntosDeVida;
    private int dañoBase;

    public Enemigo(String nombre, int puntosDeVida, int dañoBase) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.dañoBase = dañoBase;
    }

    public int atacar() {
        return dañoBase;
    }

    public void recibirDaño(int daño) {
        puntosDeVida -= daño;
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }
}

public class Zombie extends Enemigo {
    public Zombie(String nombre, int puntosDeVida, int dañoBase) {
        super(nombre, puntosDeVida, dañoBase);
    }

    @Override
    public int atacar() {
        recibirDaño(-5); // Regenera 5 puntos de vida
        return super.atacar();
    }
}

public class Vampiro extends Enemigo {
    public Vampiro(String nombre, int puntosDeVida, int dañoBase) {
        super(nombre, puntosDeVida, dañoBase);
    }

    @Override
    public int atacar() {
        int daño = super.atacar();
        recibirDaño(-daño / 2); // Roba vida
        return daño;
    }
}
