package ejer1;
import java.util.Scanner;

public class FormatoFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha (por ejemplo, '4 de junio, 2004'): ");
        String fechaTexto = scanner.nextLine();
        
        try {
            String fechaNumerica = convertirFecha(fechaTexto);
            System.out.println("Fecha en formato numérico: " + fechaNumerica);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }

    private static String convertirFecha(String fechaTexto) {
        String[] partes = fechaTexto.split(" de |, ");
        if (partes.length != 3) {
            throw new IllegalArgumentException("Formato de fecha incorrecto.");
        }

        int dia = Integer.parseInt(partes[0]);
        String mesTexto = partes[1].toLowerCase();
        int anio = Integer.parseInt(partes[2]);

        int mes = convertirMes(mesTexto);
        if (mes == -1) {
            throw new IllegalArgumentException("Mes inválido.");
        }

        if (!esFechaValida(dia, mes, anio)) {
            throw new IllegalArgumentException("Fecha inválida.");
        }

        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }

    private static int convertirMes(String mesTexto) {
        switch (mesTexto) {
            case "enero": return 1;
            case "febrero": return 2;
            case "marzo": return 3;
            case "abril": return 4;
            case "mayo": return 5;
            case "junio": return 6;
            case "julio": return 7;
            case "agosto": return 8;
            case "septiembre": return 9;
            case "octubre": return 10;
            case "noviembre": return 11;
            case "diciembre": return 12;
            default: return -1;
        }
    }

    private static boolean esFechaValida(int dia, int mes, int anio) {
        if (dia < 1 || dia > 31) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (mes == 2) {
            if (esBisiesto(anio)) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }
        return true;
    }

    private static boolean esBisiesto(int anio) {
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                return anio % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}