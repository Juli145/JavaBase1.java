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

    public static int sqrSelect(int number) {
        int result = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (i * i <= number && (i + 1) * (i + 1) > number) {
                result =  i;
                break;
            }
        }
        return result;
    }


    public static int sqrtBinary(int x) {
        int result = x;
        boolean finished = false;
        if (x != 0 && x != 1) {
            int start = 1, end = x / 2;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid == x / mid) {
                    result = mid;
                    finished = true;
                    break;
                }
                if (mid < x / mid) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if (!finished) {
                result = start - 1;
            }
        }

        return result;
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
