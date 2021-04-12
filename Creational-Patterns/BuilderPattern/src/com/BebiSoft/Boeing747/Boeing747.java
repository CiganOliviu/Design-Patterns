package com.BebiSoft.Boeing747;

import com.BebiSoft.IAircraft.IAircraft;

public class Boeing747 implements IAircraft {

    public String engine;
    public String wings;
    public String cockpit;
    public String bathroom;

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public void setWings(String wings) {
        this.wings = wings;
    }

    @Override
    public String getWings() {
        return wings;
    }

    @Override
    public void setCockpit(String cockpit) {
        this.cockpit = cockpit;
    }

    @Override
    public String getCockpit() {
        return cockpit;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getBathroom() {
        return bathroom;
    }

    @Override
    public void getDetails() {

        System.out.println(getEngine());
        System.out.println(getWings());
        System.out.println(getCockpit());
        System.out.println(getBathroom());
    }
}
