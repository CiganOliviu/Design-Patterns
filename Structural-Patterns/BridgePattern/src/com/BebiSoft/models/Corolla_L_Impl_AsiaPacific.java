package com.BebiSoft.models;

import com.BebiSoft.AbstractCorollaImpl;

public class Corolla_L_Impl_AsiaPacific extends AbstractCorollaImpl {

    @Override
    public void listSafetyEquipment() {
        System.out.println("Not so safe.");
    }

    @Override
    public boolean isCarRightHanded() {
        return false;
    }
}