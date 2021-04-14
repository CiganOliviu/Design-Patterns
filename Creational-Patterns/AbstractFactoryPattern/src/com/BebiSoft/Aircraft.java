package com.BebiSoft;

import com.BebiSoft.AircraftComponents.ICockpit;
import com.BebiSoft.AircraftComponents.IEngine;
import com.BebiSoft.AircraftComponents.IWings;
import com.BebiSoft.Factory.F16Factory;

public class Aircraft {

    IEngine engine;
    ICockpit cockpit;
    IWings wings;

    IAircraftFactory factory;

    public Aircraft(IAircraftFactory factory) {

        this.factory = factory;
    }

    protected Aircraft makeAircraft() {
        return this;
    }

    private void taxi() {
        System.out.println("Taxi on runway!");
    }

    public void fly() {
        Aircraft aircraft = makeAircraft();
        aircraft.taxi();

        System.out.println("Flying");
    }
}
