package com.BebiSoft;

import com.BebiSoft.Builder.Boeing747Builder;
import com.BebiSoft.Builder.Director;
import com.BebiSoft.Builder.F16Builder;

public class Main {

    public static void main(String[] args) {

        F16Builder f16Builder = new F16Builder();
        Director f16Director = new Director(f16Builder);
        f16Director.construct(false);

        Boeing747Builder boeing747 = new Boeing747Builder();
        Director boeing747Director = new Director(boeing747);
        boeing747Director.construct(true);
    }
}
