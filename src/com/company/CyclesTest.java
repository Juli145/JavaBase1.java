package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CyclesTest {
    @Test
    public void test_evenNumbers_sumAndQuantity(){
        String actual = Cycles.sumAndQuantity();
        String expected = "Even numbers quantity = 49, their sum = 2450";
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void test_prime_primeNumber(){
        Boolean actual = Cycles.primeNumber(59);
        Boolean expected = true;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_notPrime_primeNumber(){
        Boolean actual = Cycles.primeNumber(58);
        Boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_one_primeNumber(){
        Boolean actual = Cycles.primeNumber(1);
        Boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void test_49_root(){
        int  actual = Cycles.root(49);
        int expected = 7;
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void test_3_factorial(){
        int actual = Cycles.factorial(6);
        int expected = 720;
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void test_odd_sumOfDigits(){
        int actual = Cycles.sumOfDigits(745);
        int expected = 16;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_even_sumOfDigits(){
        int actual = Cycles.sumOfDigits(-745);
        int expected = -16;
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void test_even_mirroredNumber(){
        int actual = Cycles.mirroredNumber(745);
        int expected = 547;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_odd_mirroredNumber(){
        int actual = Cycles.mirroredNumber(-745);
        int expected = -547;
        Assertions.assertEquals(actual, expected);

    }
}
