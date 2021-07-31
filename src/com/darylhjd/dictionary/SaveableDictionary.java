package com.darylhjd.dictionary;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class SaveableDictionary {
    protected HashMap<String, String> dict;
    protected String file;

    public SaveableDictionary(String file) {
        this.file = file;
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

    public boolean load() {
        try (Stream<String> stream = Files.lines(Paths.get(this.file))) {
            stream.forEach(s -> {
                String[] split = s.split(":");
                this.add(split[0], split[1]);
                this.add(split[1], split[0]);
            });
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean save() {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(this.file), StandardCharsets.UTF_8)) {
            Set<String> met = new HashSet<>();
            for (Map.Entry<String, String> e: this.dict.entrySet()) {
                String key = e.getKey();
                String value = e.getValue();
                if (!(met.contains(key) && met.contains(value))) {
                    writer.write(String.format("%s:%s\n", key, value));
                    met.add(key);
                    met.add(value);
                }
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
