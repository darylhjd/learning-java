package com.darylhjd.part2;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> map;

    public Abbreviations() {
        this.map = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.map.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.map.containsKey(abbreviation);
    }

    public String findExplanation(String abbreviation) {
        return this.map.get(abbreviation);
    }
}
