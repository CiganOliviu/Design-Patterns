package com.CiganEnterprise;

public class Main {

    public static void main(BlackBox blackBox) throws Exception {

        byte[] memento = blackBox.GetState();

        blackBox = blackBox.SetState(memento);
    }
}
