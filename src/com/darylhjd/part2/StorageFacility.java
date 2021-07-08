package com.darylhjd.part2;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());

        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> list = this.storage.get(storageUnit);
        if (list == null) {
            return;
        }

        list.remove(item);
        if (list.size() == 0) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(this.storage.keySet());
    }
}
