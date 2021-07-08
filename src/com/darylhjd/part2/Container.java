package com.darylhjd.part2;

public class Container {
    private int amount;

    public Container() {}

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.amount = Math.min(this.amount + amount, 100);
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.amount = Math.max(this.amount - amount, 0);
    }

    @Override
    public String toString() {
        return String.format("%d/100", this.amount);
    }
}
