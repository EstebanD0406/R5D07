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
    @Test
    void testGenerate3() {
        //GIVEN
        int nb = 3;
        expectedList.add(3);
        //WHEN
        actualList = facteurP.generate(nb);
        //THEN
        assertThat(actualList).isEqualTo(expectedList);
    }
    @Test
    void testGenerate4() {
        //GIVEN
        int nb = 4;
        expectedList.add(2);
        expectedList.add(2);
        //WHEN
        actualList = facteurP.generate(nb);
        //THEN
        assertThat(actualList).isEqualTo(expectedList);
    }
    @Test
    void testGenerate6() {
        //GIVEN
        int nb = 6;
        expectedList.add(2);
        expectedList.add(3);
        //WHEN
        actualList = facteurP.generate(nb);
        //THEN
        assertThat(actualList).isEqualTo(expectedList);
    }
    @Test
    void testGenerate8() {
        //GIVEN
        int nb = 8;
        //WHEN
        actualList = facteurP.generate(nb);
        //THEN
        assertThat(actualList).isEqualTo(expectedList);
    }
    @Test
    void testGenerate9() {
        //GIVEN
        int nb = 9;
        //WHEN
        actualList = facteurP.generate(nb);
        //THEN
        assertThat(actualList).isEqualTo(expectedList);
    }
    @Test
    void testGenerate1001() {
        //GIVEN
        int nb = 1001;
        //WHEN
        actualList = facteurP.generate(nb);
        //THEN
        assertThat(actualList).isEqualTo(expectedList);
    }
}
