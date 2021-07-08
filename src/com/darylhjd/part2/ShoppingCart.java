package com.darylhjd.part2;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> list;

    public ShoppingCart() {
        this.list = new ArrayList<>();
    }

    public void add(String product, int price) {
        // Create new item
        Item i = new Item(product, 1, price);
    }
}
