package com.BebiSoft;

public class FuelMonitor {

    private int liters;

    int getLiters() {
        return this.liters;
    }

    void setLiters(int liters) {
        this.liters = liters;
    }

    void turnOff() {
        System.out.println("Turning Off...");
    }
}
