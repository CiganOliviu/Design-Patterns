package com.CiganEnterprise;

public class F16 implements IAircraft {

    ControlTower controlTower;

    public F16(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    public void land() {
        System.out.println("Landing..");
    }

    public void requestControlTowerToLand() {
        controlTower.requestToLand(this);
    }
}
