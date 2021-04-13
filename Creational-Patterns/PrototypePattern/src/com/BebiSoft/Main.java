package com.BebiSoft;

public class Main {

    public static void main(String[] args) {

        IAircraftPrototype prototype = new F16();

        IAircraftPrototype f16A = prototype.clone();
        f16A.setEngine("GE");

        IAircraftPrototype f16B = prototype.clone();
        f16B.setEngine("MITX");
    }
}
