package com.BebiSoft;

public abstract class AbstractCorolla {

    protected AbstractCorollaImpl corollaImpl;

    public AbstractCorolla(AbstractCorollaImpl corollaImpl) {
        this.corollaImpl = corollaImpl;
    }

    public abstract void listSafetyEquipment();

    public abstract boolean isCarRightHanded();
}