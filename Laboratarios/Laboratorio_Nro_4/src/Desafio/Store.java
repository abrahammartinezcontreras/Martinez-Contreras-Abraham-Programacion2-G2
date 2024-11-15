package Desafio;

package com.ejemplo.tienda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void applyDiscountToAll(Consumer<Product> discountStrategy) {
        for (Product product : products) {
            discountStrategy.accept(product);
        }
    }

    public void showProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
