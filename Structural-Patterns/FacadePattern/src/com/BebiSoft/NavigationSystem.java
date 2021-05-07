package com.BebiSoft;

public class NavigationSystem {

    private String direction;

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setDirectionBasedOnSpeedAndFuel(int fuel, int engineSpeed) {

        System.out.println("Setting the course..");
    }

    void turnOff() {
        System.out.println("Turning Off...");
    }
}
