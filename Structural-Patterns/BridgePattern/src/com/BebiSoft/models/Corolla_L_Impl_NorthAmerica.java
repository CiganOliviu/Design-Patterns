package com.BebiSoft.models;

import com.BebiSoft.AbstractCorollaImpl;

public class Corolla_L_Impl_NorthAmerica extends AbstractCorollaImpl {

    @Override
    public void listSafetyEquipment() {
        System.out.println("High safety standards.");
    }

    @Override
    public boolean isCarRightHanded() {
        return true;
    }
}
