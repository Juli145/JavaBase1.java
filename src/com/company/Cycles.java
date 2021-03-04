package com.company;

public class Cycles {

    public static String sumAndQuantity(){
    int sum = 0;
    int quantity = 0;
        for (int i = 2; i <= 99; i += 2) {
        if (i % 2 == 0) {
            sum = sum + i;
            quantity = quantity + 1;
        }
    }
        return "Even numbers quantity = " + quantity + ", their sum = " + sum;

}
    public static boolean primeNumber(int a){
        if (a <= 1){
            return false;
        }
        for (int i = 2; i <= a / 2; i++) {
            if(a % i == 0){
                return false;
            }
        }
         return true;
    }
    public static int root(int a){
        int i;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (i = 1; i < array.length; i++) {
            if (a / i == i) {
                break;
            }
        }
        return i;
    }
    public static int factorial(int n){
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    public static int sumOfDigits(int number){
            int result = 0;
            while(number != 0){
                result = result + number % 10;
                number = number / 10;
            }
            return result;
        }
    public static int mirroredNumber(int num){
        int result = 0;
        for( ;num != 0; result *= 10){
            result = result + num % 10;
            num = num / 10;
        }
        result = result/10;
        return result;
    }
}
