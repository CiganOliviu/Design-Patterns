package com.BebiSoft.Builder;

import com.BebiSoft.F16.F16;
import com.BebiSoft.IAircraft.IAircraft;

public class F16Builder extends AircraftBuilder {

    F16 f16 = new F16();

    @Override
    public void buildEngine() {
       f16.setEngine("Pratt & Whitney F100");
    }

    @Override
    public void buildWings() {
        f16.setWings("Small Wings");
    }

    @Override
    public void buildCockpit() {
        f16.setCockpit("Integrated Cockpit");
    }

    public IAircraft getResult() {
        return f16;
    }
}
