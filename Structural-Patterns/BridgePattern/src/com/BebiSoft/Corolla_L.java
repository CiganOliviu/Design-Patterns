package com.BebiSoft;

public class Corolla_L extends AbstractCorolla {

    public Corolla_L(AbstractCorollaImpl corollaImpl) {
        super(corollaImpl);
    }

    @Override
    public void listSafetyEquipment() {
        corollaImpl.listSafetyEquipment();

    }

    @Override
    public boolean isCarRightHanded() {
        return corollaImpl.isCarRightHanded();
    }
}
