package com.darylhjd.part1;

public class Cube {
    private int length;

    public Cube(int edgeLength) {
        this.length = edgeLength;
    }

    public int volume() {
        return (int) Math.pow(this.length, 3);
    }

    @Override
    public String toString() {
        return String.format("The length of the cube is %d and the volume %d", this.length, this.volume());
    }
}
