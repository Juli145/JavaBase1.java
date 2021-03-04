package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunctionTest {

    @Test
    public void test_5_getDayByNumber(){
        String actual = Functions.getDayByNumber(5);
        String expected = "Friday";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_default_getDayByNumber(){
        String actual = Functions.getDayByNumber(9);
        String expected = "Sunday";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_getDistance(){
        int actual = Functions.getDistance(1, 2, 3, 4);
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_125_getStringByNumber(){
        String actual = Functions.getStringByNumber(125);
        String expected = "сто двадцать пять  ";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_zero_getStringByNumber(){
        String actual = Functions.getStringByNumber(0);
        String expected = "ноль";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_zero_getNumberByString(){
        int actual = Functions.getNumberByString("ноль");
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_125_getNumberByString(){
        int actual = Functions.getNumberByString("сто двадцать пять");
        int expected = 125;
        Assertions.assertEquals(actual, expected);
    }
}
