package com.BebiSoft;

public class F16 implements IAircraftPrototype {

    private String engine;

    @Override
    public void startEngine() {
        System.out.println("Start Engine!");
    }

    @Override
    public IAircraftPrototype clone() {
        return new F16();
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String getEngine() {
        return engine;
    }
}
