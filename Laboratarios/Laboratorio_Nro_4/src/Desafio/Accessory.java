package Desafio;

package com.ejemplo.tienda;

public class Accessory implements Product {
    private String name;
    private double price;

    public Accessory(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void applyDiscount(double discount) {
        if (discount > 0 && discount <= 1) {
            price -= price * discount;
        } else if (discount > 1) {
            price -= discount;
        }
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

