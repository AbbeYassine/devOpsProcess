package com.mycompany.app;

/**
 * Created by Abbes on 03/12/2016.
 */
public class Calcul {

    public final int additionner(final int a, final int b) {
        return a + b;
    }

    public int multiplier(final int a, final int b) {
        return a * b;
    }

    public final boolean trait(final String name) {
        name.toUpperCase();
        return name.equals("YASSINE");
    }
}
