package ejercicio_3;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected double peso; // Atributo extra

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso; // Inicializar atributo extra
    }

    public abstract void hacerSonido();

    public void mostrarInfo() {
        System
