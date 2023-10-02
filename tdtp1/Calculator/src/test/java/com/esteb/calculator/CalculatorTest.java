package com.esteb.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private static Calculator calc;
    @BeforeEach
    void init(){
        calc = new Calculator();
    }
    @Test
    void somme_nb_positif(){
        //Given
        int nb1 = 12;
        int nb2 = 12;
        //When
        int result = calc.add(nb1, nb2);
        //Then
        assertThat(result).isEqualTo(24);
    }
    @Test
    void somme_nb_negatif(){
        //Given
        int nb1 = 12;
        int nb2 = -14;
        //When
        int result = calc.add(nb1, nb2);
        //Then
        assertThat(result).isEqualTo(-2);
    }

    @Test
    void somme_nombres_negatif(){
        //Given
        int nb1 = -12;
        int nb2 = -12;
        //When
        int result = calc.add(nb1, nb2);
        //then
        assertThat(result).isEqualTo(-24);
    }

    @Test
    void division_nb(){
        //Given
        int nb1 = 12;
        int nb2 = 2;
        //When
        int result = calc.divide(nb1, nb2);
        //Then
        assertThat(result).isEqualTo(6);
    }

    @ParameterizedTest
    @CsvSource({"0, 1, 1", "1, 2, 3", "-2, 2, 0", "0, 0, 0", "-1, -2, -3"})
    public void testAdd(int opG, int opD, int resultatVoulu) {
        int result = calc.add(opG, opD);
        assertEquals(resultatVoulu, result);
    }

    @Test
    void testAddWithOverflow() {

        assertThatThrownBy(() -> calc.add2(1, Integer.MAX_VALUE))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("OVERFLOW");
    }

    @Test
    void testDivide0(){

    }
    @AfterEach
    void after(){
        calc = null;
    }
}