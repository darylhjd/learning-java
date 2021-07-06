package com.darylhjd;

public class Whistle {
    private String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.printf("The whistle goes %s!\n", this.sound);
    }
}
