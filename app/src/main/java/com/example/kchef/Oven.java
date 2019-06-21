package com.example.kchef;

public class Oven {
    private int temperature;
    private boolean working;

    public Oven() {
        temperature = 0;
        working = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isWorking() {
        int temp = getTemperature();
        if (temp>0){
            return true;
        }
        else{
            return false;
        }
    }
}
