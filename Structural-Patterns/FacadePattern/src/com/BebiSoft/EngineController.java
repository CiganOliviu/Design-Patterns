package com.BebiSoft;

public class EngineController {

    private int engineSpeed;

    int getEngineSpeed() {
        return this.engineSpeed;
    }

    void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    void turnOff() {
        System.out.println("Turning Off...");
    }
}
