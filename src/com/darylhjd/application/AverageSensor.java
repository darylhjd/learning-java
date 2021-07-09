package com.darylhjd.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    protected List<Sensor> sensors;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor s: this.sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor s: this.sensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor s: this.sensors) {
            s.setOff();
        }
    }

    @Override
    public int read() {
        return (int) this.sensors.stream()
                .mapToInt(Sensor::read)
                .average().orElse(0.0);
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
}
