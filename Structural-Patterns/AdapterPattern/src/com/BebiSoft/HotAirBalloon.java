package com.BebiSoft;

public class HotAirBalloon {

    String gasUsed = "Helium";

    void fly(String gasUsed) {
        System.out.println("Fly with" + gasUsed);
    }

    String inflateWithGas() {
        return gasUsed;
    }
}
