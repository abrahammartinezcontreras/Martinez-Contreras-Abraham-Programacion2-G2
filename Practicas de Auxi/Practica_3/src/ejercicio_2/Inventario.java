package ejercicio_2;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<String> items;

    public Inventario() {
        items = new ArrayList<>();
    }

    public void agregarItem(String item) {
        items.add(item);
    }

    public void mostrarItems() {
        for (String item : items) {
            System.out.println(item);
        }
    }
}

