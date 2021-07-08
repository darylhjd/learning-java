package com.darylhjd.part2;

import java.util.HashMap;
import java.util.Objects;

public class IOU {
    private HashMap<String, Double> map;

    public IOU() {
        this.map = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.map.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.map.getOrDefault(toWhom, 0.0);
    }
}
