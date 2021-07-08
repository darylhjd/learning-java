package com.darylhjd.part2;

import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        for (Movable o: this.herd) {
            b.append(o.toString());
            b.append('\n');
        }
        return b.toString();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable m: this.herd) {
            m.move(dx, dy);
        }
    }
}
