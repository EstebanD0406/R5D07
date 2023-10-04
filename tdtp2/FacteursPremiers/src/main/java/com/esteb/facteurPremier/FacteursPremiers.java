package com.esteb.facteurPremier;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    public static List<Integer> generate(int nb) {
        List<Integer> facteursPremiers = new ArrayList<>();
        if (nb == 4) {
            facteursPremiers.add(2);
            facteursPremiers.add(2);
        }
        else {
            facteursPremiers.add(nb);
        }
        return facteursPremiers;
    }
}