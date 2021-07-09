package com.darylhjd.application;

public class StandardSensor implements Sensor {
    protected int num;
    protected boolean on;

    public StandardSensor(int num) {
        this.num = num;
        this.on = true;
    }

    @Override
    public void setOn() {}

    @Override
    public void setOff() {}

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public int read() {
        return this.num;
    }
}
