package com.darylhjd.dictionary;

import java.util.HashMap;

public class SavableDictionary {
    protected HashMap<String, String> dict;

    public SavableDictionary() {
        this.dict = new HashMap<>();
    }

    public void add(String words, String translation) {
        this.dict.putIfAbsent(words, translation);
        this.dict.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        return this.dict.get(word);
    }

    public void delete(String word) {
        String trans = this.dict.remove(word);
        this.dict.remove(trans);
    }
}
