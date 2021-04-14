package com.BebiSoft;

import com.BebiSoft.AircraftComponents.ICockpit;
import com.BebiSoft.AircraftComponents.IEngine;
import com.BebiSoft.AircraftComponents.IWings;

public interface IAircraftFactory {

    IEngine createEngine();
    IWings createWings();
    ICockpit createCockpit();
}
