package com.darylhjd.part2;

import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> channel;


    public Pipe() {
        this.channel = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.channel.add(value);
    }

    public T takeFromPipe() {
        if (!this.isInPipe()) {
            return null;
        }
        return this.channel.remove(0);
    }

    public boolean isInPipe() {
        return this.channel.size() != 0;
    }
}
