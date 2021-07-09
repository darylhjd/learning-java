package com.darylhjd.application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    protected boolean on;

    public TemperatureSensor() {
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void setOn() {
        this.on = true;
    }

    @Override
    public void setOff() {
        this.on = false;
    }

    @Override
    public int read() {
        if (!this.on) {
            throw new IllegalStateException();
        }
        return new Random().nextInt(61) - 30;
    }
}
