package com.BebiSoft;

public class Main {

    public static void main(String[] args) {

        IAircraft boeing = new Boeing747();
        LuxuryClass luxuryBoeing = new LuxuryClass(boeing);
        BulletProof bulletProofBoeing = new BulletProof(luxuryBoeing);

        System.out.println(bulletProofBoeing.getWeight());
    }
}
