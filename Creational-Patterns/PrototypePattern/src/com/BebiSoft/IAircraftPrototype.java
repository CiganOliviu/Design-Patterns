package com.BebiSoft;

public interface IAircraftPrototype {

    void startEngine();

    IAircraftPrototype clone();

    void setEngine(String engine);
    String getEngine();
}
