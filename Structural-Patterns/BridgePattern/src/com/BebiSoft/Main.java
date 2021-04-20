package com.BebiSoft;

import com.BebiSoft.models.Corolla_L_Impl_AsiaPacific;
import com.BebiSoft.models.Corolla_L_Impl_NorthAmerica;

public class Main {

    public static void main(String[] args) {

        AbstractCorolla asianCorolla = new Corolla_L(new Corolla_L_Impl_AsiaPacific());
        asianCorolla.listSafetyEquipment();

        AbstractCorolla americanCorolla = new Corolla_L(new Corolla_L_Impl_NorthAmerica());
        americanCorolla.listSafetyEquipment();
    }
}
