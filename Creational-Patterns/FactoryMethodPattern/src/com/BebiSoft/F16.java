package com.BebiSoft;

import com.BebiSoft.AircraftComponents.ICockpit;
import com.BebiSoft.AircraftComponents.IEngine;
import com.BebiSoft.F16Aircrafts.F16AEngine;
import com.BebiSoft.F16Aircrafts.F16BEngine;
import com.BebiSoft.F16Aircrafts.F16Cockpit;
import com.BebiSoft.F16Aircrafts.F16Engine;

public class F16 {
    IEngine engine;
    ICockpit cockpit;

    protected F16 makeF16() {
        engine = new F16Engine();
        cockpit = new F16Cockpit();

        return this;
    }

    public void taxi() {
        System.out.println("F16 is taxing on the runway !");
    }

    public void fly() {

        F16 f16 = makeF16();
        f16.taxi();
        System.out.println("F16 is in the air !");
    }
}

class F16A extends F16 {

    @Override
    protected F16 makeF16() {
        super.makeF16();
        engine = new F16AEngine();

        return this;
    }
}

class F16B extends F16 {

    @Override
    protected F16 makeF16() {
        super.makeF16();
        engine = new F16BEngine();

        return this;
    }
}
