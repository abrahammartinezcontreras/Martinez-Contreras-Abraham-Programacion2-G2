package ejercicio6;

public class CalculoDistancia {
    public static void main(String[] args) {
        double g = 9.8; 
        double t = 5; 

        double distancia = calcularDistancia(g, t);
        System.out.println("La distancia recorrida es: " + distancia + " metros");
    }

    public static double calcularDistancia(double g, double t) {
        return 0.5 * g * t * t;
    }
}