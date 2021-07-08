package com.darylhjd.part2;

import java.util.ArrayList;
import java.util.HashMap;

public class Dict {
    private HashMap<String, ArrayList<String>> dict;

    public Dict() {
        this.dict = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dict.putIfAbsent(word, new ArrayList<>());

        // Get the list of translations for this word, then add the current one.
        this.dict.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.dict.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        this.dict.remove(word);
    }
}
