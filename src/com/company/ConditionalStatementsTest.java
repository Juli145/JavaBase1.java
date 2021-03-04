package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionalStatementsTest {
    @Test
    public void test_evenNumber_getSumOrMultiply() {
        int actual = ConditionalStatements.getSumOrMultiply(8, 5);
        int expected = 40;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_oddNumber_getSumOrMultiply() {
        int actual = ConditionalStatements.getSumOrMultiply(7, 5);
        int expected = 12;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test_I_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(3, 5);
        String expected = "I quarter";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_II_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(-3, 5);
        String expected = "II quarter";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_III_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(-3, -5);
        String expected = "III quarter";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_IV_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(3, -5);
        String expected = "IV quarter";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_between_I_II_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(0, 5);
        String expected = "on the axis y between I and II";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_between_III_IV_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(0, -5);
        String expected = "on the axis y between III and IV";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_between_I_IV_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(3, 0);
        String expected = "on the axis x between I and IV";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_between_II_III_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(-3, 0);
        String expected = "on the axis x between II and III";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_origin_getQuarterByCoordinates() {
        String actual = ConditionalStatements.getQuarterByCoordinates(0, 0);
        String expected = "at the origin";
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void test_positive_showSum(){
        int actual = ConditionalStatements.showSum(1, 2, 3);
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_negative_showSum(){
        int actual = ConditionalStatements.showSum(-1, -2, -3);
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_zero_showSum(){
        int actual = ConditionalStatements.showSum(0, 0, 0);
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void test_sum_showMax(){
        int actual = ConditionalStatements.showMax(1, 1, 1);
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_multiply_showMax(){
        int actual = ConditionalStatements.showMax(2, 3, 4);
        int expected = 27;
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void test_F_getMark(){
        String actual = ConditionalStatements.getMark(15);
        String expected = "F";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_E_getMark(){
        String actual = ConditionalStatements.getMark(25);
        String expected = "E";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_D_getMark(){
        String actual = ConditionalStatements.getMark(45);
        String expected = "D";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_C_getMark(){
        String actual = ConditionalStatements.getMark(65);
        String expected = "C";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_B_getMark(){
        String actual = ConditionalStatements.getMark(85);
        String expected = "B";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_A_getMark(){
        String actual = ConditionalStatements.getMark(95);
        String expected = "A";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_exception_101_getMark(){
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> ConditionalStatements.getMark(101),
                "Число должно быть больше 0 и меньше 100");
    }
    @Test
    public void test_exception_minus_getMark(){
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> ConditionalStatements.getMark(-15),
                "Число должно быть больше 0 и меньше 100");
    }
}
