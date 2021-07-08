package com.darylhjd.part2;

public class Organism implements Movable {
    private int x, y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x: %d, y: %d", this.x, this.y);
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
