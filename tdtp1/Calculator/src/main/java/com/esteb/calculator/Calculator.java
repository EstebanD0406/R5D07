package com.esteb.calculator;

public class Calculator {
    public int add(int opG, int opD) {
        return opG+opD;
    }

    public int add2(int opG, int opD) {
        if ((opG > 0 && opD > Integer.MAX_VALUE )) {
            throw new ArithmeticException("Cela dépasse la valeur d'un int");
        }
        return opG + opD;
    }
    public int divide(int opG, int opD) {
        return opG/opD;
    }

    public int divide2(int opG, int opD) {
        if(opD == 0) {
            throw new ArithmeticException("Division par 0");
        }
        return opG/opD;
    }
}
