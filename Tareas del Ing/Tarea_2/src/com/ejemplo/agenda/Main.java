package com.ejemplo.agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    Contacto contacto = new Contacto(nombre, telefono, email);
                    agenda.agregarContacto(contacto);
                    break;
                case 2:
                    System.out.print("Nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    agenda.eliminarContacto(nombreEliminar);
                    break;
                case 3:
                    agenda.listarContactos();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

