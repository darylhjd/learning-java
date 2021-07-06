package com.darylhjd;

public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void decrease() {
        this.value--;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int by) {
        if (by <= 0) {
            return;
        }
        this.value += by;
    }

    public void decrease(int by) {
        if (by <= 0) {
            return;
        }
        this.value -= by;
    }
}
