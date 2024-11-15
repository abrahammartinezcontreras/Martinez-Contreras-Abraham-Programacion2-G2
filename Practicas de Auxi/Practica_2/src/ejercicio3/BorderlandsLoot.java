package ejercicio3;
import java.util.Random;
import java.util.Scanner;

class Botin {
    String tipo;
    String rareza;
    String atributo;

    public Botin(String tipo, String rareza, String atributo) {
        this.tipo = tipo;
        this.rareza = rareza;
        this.atributo = atributo;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Rareza: " + rareza + ", Atributo: " + atributo;
    }
}

public class BorderlandsLoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            Botin botin = generarBotin();
            System.out.println("¡Has encontrado un botín!");
            System.out.println(botin);

            System.out.print("¿Quieres seguir enfrentándote a enemigos para obtener más botín? (sí/no): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("sí")) {
                continuar = false;
            }
        }

        System.out.println("¡Gracias por jugar! Hasta la próxima.");
        scanner.close();
    }

    public static Botin generarBotin() {
        String[] tipos = {"Arma", "Escudo", "Modificador de Habilidad"};
        String[] rarezas = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
        String[] atributosArma = {"Daño alto", "Velocidad de disparo rápida", "Precisión mejorada"};
        String[] atributosEscudo = {"Alta capacidad", "Regeneración rápida", "Resistencia elemental"};
        String[] atributosModificador = {"Aumento de daño", "Mejora de salud", "Reducción de tiempo de recarga"};

        Random rand = new Random();
        String tipo = tipos[rand.nextInt(tipos.length)];
        String rareza = rarezas[rand.nextInt(rarezas.length)];
        String atributo = "";

        switch (tipo) {
            case "Arma":
                atributo = atributosArma[rand.nextInt(atributosArma.length)];
                break;
            case "Escudo":
                atributo = atributosEscudo[rand.nextInt(atributosEscudo.length)];
                break;
            case "Modificador de Habilidad":
                atributo = atributosModificador[rand.nextInt(atributosModificador.length)];
                break;
        }

        return new Botin(tipo, rareza, atributo);
    }
}