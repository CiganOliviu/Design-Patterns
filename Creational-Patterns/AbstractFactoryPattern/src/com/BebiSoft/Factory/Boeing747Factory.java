package com.BebiSoft.Factory;

import com.BebiSoft.AircraftComponents.ICockpit;
import com.BebiSoft.AircraftComponents.IEngine;
import com.BebiSoft.AircraftComponents.IWings;
import com.BebiSoft.IAircraftFactory;

public class Boeing747Factory implements IAircraftFactory {

    @Override
    public IEngine createEngine() {
        return null;
    }

    @Override
    public IWings createWings() {
        return null;
    }

    @Override
    public ICockpit createCockpit() {
        return null;
    }
}
