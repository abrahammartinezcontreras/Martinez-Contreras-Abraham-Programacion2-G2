package com.ejemplo.agenda;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    private static final String FILE_NAME = "contactos.dat";

    public Agenda() {
        contactos = new ArrayList<>();
        cargarContactos();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        guardarContactos();
    }

    public void eliminarContacto(String nombre) {
        contactos.removeIf(contacto -> contacto.getNombre().equalsIgnoreCase(nombre));
        guardarContactos();
    }

    public void listarContactos() {
        contactos.forEach(System.out::println);
    }

    private void guardarContactos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(contactos);
        } catch (IOException e) {
            System.out.println("Error al guardar los contactos: " + e.getMessage());
        }
    }

    private void cargarContactos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            contactos = (List<Contacto>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Archivo no encontrado, probablemente la primera vez que se ejecuta el programa.
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los contactos: " + e.getMessage());
        }
    }
}

