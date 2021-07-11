package com.CiganEnterprise;

public abstract class AbstractPreFlightCheckList {

    final public void RunCheckList() {

        IsFuelEnough();
        DoorsLocked();
        CheckAirPressure();
    }

    final protected void IsFuelEnough() {

    }

    protected void DoorsLocked() {

    }

    abstract void CheckAirPressure();
}
