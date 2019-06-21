package com.example.kchef;

public class Station {
    private boolean stationStatus;

    public Station(boolean stationStatus) {
        this.stationStatus = stationStatus;
    }

    public Station() {
        stationStatus = false;
    }

    public boolean getStationStatus() {
        return stationStatus;
    }

    public void setStationStatus(boolean stationStatus) {
        this.stationStatus = stationStatus;
    }
}
