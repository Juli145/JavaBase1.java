package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {

    @Test
    public void test_minElement(){
        int array [] = {10, 3, 5, 0, -7};
        int actual = Arrays.minElement(array);
        int expected = -7;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void test_maxElement(){
        int array [] = {3, 30, 10, 15, 24};
        int actual = Arrays.maxElement(array);
        int expected = 30;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_indexMin(){
        int array [] = {1, 10, 0, 4, 3, 9, -2, -11, -3};
        int actual = Arrays.indexMin(array);
        int expected = 7;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_indexMax(){
        int array [] = {31, 6, 9, 1, 13};
        int actual = Arrays.indexMax(array);
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_negativeIndexSum(){
        int array [] = {1, 2, 3, 4, 5, 6, 7, 8};
        int actual = Arrays.negativeIndexSum(array);
        int expected = 20;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_reverse(){
        int array [] = {1, 2, 3, 4, 5, 6, 7, 8};
        int [] actual = Arrays.reverse(array);
        int [] expected = {8, 7, 6, 5, 4, 3, 2, 1};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test_quantityOfNegativeElements(){
        int [] array = new int []{1, 2, 3, 4, 5};
        int actual = Arrays.quantityOfNegativeElements(array);
        int  expected = 3;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_halfReverse(){
        int [] array = new int []{1, 2, 3, 4, 5};
        int[] actual = Arrays.halfReverse(array);
        int [] expected = {4, 5, 3, 1, 2};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test_bubbleSort(){
        int [] array = new int []{121, 25, -3, 10, 4, 1, 56, 7};
        int [] actual = Arrays.bubbleSort(array);
        int [] expected = {-3, 1, 4, 7, 10, 25, 56, 121};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test_selectionSort(){
        int [] array = new int []{121, 25, -3, 11, 4, 1, 56, 7};
        int [] actual = Arrays.selectionSort(array);
        int [] expected = {-3, 1, 4, 7, 11, 25, 56, 121};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test_insertionSort(){
        int [] array = new int []{121, 24, -3, 10, 4, 1, 56, 7};
        int [] actual = Arrays.insertionSort(array);
        int [] expected = {-3, 1, 4, 7, 10, 24, 56, 121};
        Assertions.assertArrayEquals(actual, expected);
    }
}
