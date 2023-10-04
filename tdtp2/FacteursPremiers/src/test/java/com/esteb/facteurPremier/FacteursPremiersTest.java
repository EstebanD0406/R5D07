package com.esteb.facteurPremier;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
class FacteursPremiersTest {

    private static FacteursPremiers facteurP;
    List<Integer> expectedList;
    List<Integer> actualList;
    @BeforeEach
    void init() {
        facteurP = new FacteursPremiers();
        expectedList = new ArrayList<Integer>();
    }
    @Test
    void testGenerate1() {
        //GIVEN
        int nb = 1;
        //WHEN
        actualList = facteurP.generate(nb);
        //THEN
        assertThat(actualList).isEqualTo(expectedList);
    }

    @Test
    void testGenerate2() {
        //GIVEN
        int nb = 2;
        expectedList.add(2);
        //WHEN
        actualList = facteurP.generate(nb);
        //THEN
        assertThat(actualList).isEqualTo(expectedList);
    }





















/*

    @Test
    void testGenerateNbPremier() {
        assertThat(FacteursPremiers.generate(2), contains(2));
    }

    @Test
    void testGenerateProduit2() {
        assertThat(FacteursPremiers.generate(6), contains(2, 3));
    }

    @Test
    void testGenerateProduit3identique() {
        assertThat(FacteursPremiers.generate(8), contains(2, 2, 2));
    }

    @Test
    void testGenerateProduit3() {
        assertThat(FacteursPremiers.generate(12), contains(2, 2, 3));
    }

    @Test
    void testGenerateNbRepete() {
        assertThat(FacteursPremiers.generate(18), contains(2, 3, 3));
    }

    @Test
    void testGenerateNbGrand() {
        assertThat(FacteursPremiers.generate(1001), contains(7, 11, 13));
    }
 */
}
