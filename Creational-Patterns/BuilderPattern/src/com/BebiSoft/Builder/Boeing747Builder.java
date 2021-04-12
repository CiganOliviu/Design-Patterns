package com.BebiSoft.Builder;

import com.BebiSoft.Boeing747.Boeing747;

public class Boeing747Builder extends AircraftBuilder {

    Boeing747 boeing747;

    @Override
    public void buildEngine() {
        System.out.println("Engine created for boeing747!");
    }

    @Override
    public void buildWings() {
        System.out.println("Wings created for boeing747!");
    }

    @Override
    public void buildCockpit() {
        System.out.println("Cockpit created for boeing747!");
    }

    @Override
    public void buildBathroom() {
        System.out.println("Bathroom created for boeing747");
    }
}
