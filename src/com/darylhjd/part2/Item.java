package com.darylhjd.part2;

public class Item {
    private String name;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    @Override
    public String toString() {
        return String.format("%s: %d", this.name, this.qty);
    }
}
