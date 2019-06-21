package com.example.kchef;

public class Fire {
    private double heat;
    private boolean working;

    public Fire() {
        heat = 0;
        working = false;
    }

    public double getHeat() {
        return heat;
    }

    public void setHeat(double heat) {
        this.heat = heat;
    }

    public boolean isWorking() {
        double temp = getHeat();
        if (temp>0){
            return true;
        }
        else{
            return false;
        }
    }
}
