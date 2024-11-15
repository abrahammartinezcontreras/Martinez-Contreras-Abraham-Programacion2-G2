package desafio;

package com.ejemplo.agenda;

import java.io.*;
import java.util.HashMap;

public class Agenda {
    private HashMap<String, Contacto> contactos;
    private static final String FILE_NAME = "contactos.dat";

    public Agenda() {
        contactos = new HashMap<>();
        cargarContactos();
    }

    public void agregarContacto(Contacto contacto) {
        if (contactos.containsKey(contacto.getEmail())) {
            System.out.println("Un contacto con este email ya existe.");
        } else {
            contactos.put(contacto.getEmail(), contacto);
            guardarContactos();
            System.out.println("Contacto agregado exitosamente.");
        }
    }

    public void verContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            contactos.values().forEach(System.out::println);
        }
    }

    public void buscarContacto(String email) {
        Contacto contacto = contactos.get(email);
        if (contacto != null) {
            System.out.println(contacto);
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void borrarContacto(String email) {
        if (contactos.remove(email) != null) {
            guardarContactos();
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("No se encontró un contacto con el email proporcionado.");
        }
    }

    public void storeContacts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(contactos);
        } catch (IOException e) {
            System.out.println("Error al guardar los contactos: " + e.getMessage());
        }
    }

    public void loadContacts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            contactos = (HashMap<String, Contacto>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println
