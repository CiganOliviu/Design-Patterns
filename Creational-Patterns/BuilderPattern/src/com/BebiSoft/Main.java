package com.BebiSoft;

import com.BebiSoft.Builder.Boeing747Builder;
import com.BebiSoft.Builder.Director;
import com.BebiSoft.Builder.F16Builder;

public class Main {

    public static void main(String[] args) {

        F16Builder f16Builder = new F16Builder();
        Director f16Director = new Director(f16Builder);
        f16Director.construct(false);
        f16Builder.getResult().getDetails();

        Boeing747Builder boeing747Builder = new Boeing747Builder();
        Director boeing747Director = new Director(boeing747Builder);
        boeing747Director.construct(true);
        boeing747Builder.getResult().getDetails();
    }
}
