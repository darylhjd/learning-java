package com.darylhjd.part2;

public class Hideout<T> {
    private T item;

    public Hideout() {}

    public void putIntoHideout(T toHide) {
        this.item = toHide;
    }

    public T takeFromHideout() {
        return this.item;
    }

    public boolean isInHideout() {
        return this.item != null;
    }
}
