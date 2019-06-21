package com.example.kchef;

public class Sink {
    final static int CAPACITY = 20;
    private int counter;

    public Sink() {
        counter = 0;
    }

    public void incrCounter() {
        counter++;
    }

    public int remaining() {
        return CAPACITY - counter;
    }

    public void wash(){
        counter = 0;
    }
}
