package com.esteb.facteurPremier;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    public static List<Integer> generate(int nb) {
        List<Integer> facteursPremiers = new ArrayList<>();
        if (nb > 1) {
            facteursPremiers.add(nb);
        }
        return facteursPremiers;
    }
}