package com.darylhjd.part2;

public class CustomList<T> {
    private T[] values;

    public CustomList() {
        this.values = (T[]) new Object[10];
    }
}
