package com.darylhjd.part2;

public class Dog extends Animal implements NoiseCapable {
    public Dog() {
        super("Dog");
    }

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.printf("%s barks\n", this.name);
    }

    public void makeNoise() {
        this.bark();
    }
}
