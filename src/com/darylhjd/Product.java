package com.darylhjd;

public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }

    public void printProduct() {
        System.out.printf("%s, price %.2f, %d pcs", this.name, this.price, this.quantity);
    }
}
