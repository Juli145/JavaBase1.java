package com.company;

public class Arrays {
    public static void main(String[] args) {
    }

    public static int minElement(int [] array){
        int min = array[0];
        for(int i =0; i < array.length; i++){
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }
    public static int maxElement(int [] array) {
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static int indexMin(int [] array) {
        int min = array[0];
        int i;
        int result = 0;
        int finish = array.length;
        for(i = 0; i < finish; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        for(int index = 0; index < array.length; index++){
            if(array[index] == min){
                result = index;
            }
        }
        return result;
    }
    public static int indexMax(int [] array) {
        int max = 0;
        int result = 0;
        for(int i =0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for(int index = 0; index < array.length; index++){
            if(array[index] == max){
                result = index;
            }
        }
        return result;
    }
    public static int negativeIndexSum(int [] array) {
        int sum = 0;
        for(int index = 0; index < array.length; index++){
            if(index % 2 != 0){
                sum += array[index];
            }
        }
        return sum;
    }
    public static int [] reverse(int [] array) {
        int count = 0;
        int newArray [] = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[count++] = array[i];
        }
        return newArray;
    }
    public static int quantityOfNegativeElements(int [] array) {
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                quantity++;
            }
        }
        return quantity;
    }


    public static int[] halfReverse(int [] array) {
        int middle;
        if(array.length % 2 == 0){
            middle = array.length /2;
        }else{
            middle = array.length / 2 + 1;
        }

        for (int i = 0; i < array.length/ 2; i++) {
           int result = array[i];
           array[i] = array[middle + i];
           array[middle + i] = result;
        }
        return array;
    }
    public static int [] bubbleSort(int [] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static int [] selectionSort(int [] array){
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[index]){
                    index = j; //searching for lowest index
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        return array;
    }
    public static int [] insertionSort(int [] array){
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}