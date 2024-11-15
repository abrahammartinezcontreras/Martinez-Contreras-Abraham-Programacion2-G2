package Desafio;

package com.ejemplo.tienda;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Accessory acc1 = new Accessory("Gorra", 20.0);
        Accessory acc2 = new Accessory("Pulsera", 15.0);
        Accessory acc3 = new Accessory("Bufanda", 30.0);

        store.addProduct(acc1);
        store.addProduct(acc2);
        store.addProduct(acc3);

        System.out.println("Productos antes de los descuentos:");
        store.showProducts();

        store.applyDiscountToAll(product -> product.applyDiscount(0.10));

        System.out.println("\nProductos después de aplicar un descuento del 10%:");
        store.showProducts();

        store.applyDiscountToAll(product -> product.applyDiscount(5.0));

        System.out.println("\nProductos después de aplicar un descuento fijo de $5:");
        store.showProducts();
    }
}

