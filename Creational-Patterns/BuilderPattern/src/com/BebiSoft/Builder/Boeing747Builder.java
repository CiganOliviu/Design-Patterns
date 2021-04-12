package com.BebiSoft.Builder;

import com.BebiSoft.Boeing747.Boeing747;
import com.BebiSoft.IAircraft.IAircraft;

public class Boeing747Builder extends AircraftBuilder {

    Boeing747 boeing747 = new Boeing747();

    @Override
    public void buildEngine() {
        boeing747.setEngine("General Electric GEnx");
    }

    @Override
    public void buildWings() {
        boeing747.setWings("Huge Wings");
    }

    @Override
    public void buildCockpit() {
        boeing747.setCockpit("Dedicated Cockpit");
    }

    @Override
    public void buildBathroom() {
        boeing747.setBathroom("Small Bathrooms");
    }

    public IAircraft getResult() {
        return boeing747;
    }
}
