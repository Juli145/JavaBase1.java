package com.company;

public class ConditionalStatements{

    public static int getSumOrMultiply(int num1, int num2) {
        int result;
        if (num1 % 2 == 0) {
            result = num1 * num2;
        } else {
            result = num1 + num2;
        }
        return result;
    }
    public static String getQuarterByCoordinates(int x, int y){
        String result = "";
        if (x > 0 && y > 0){
            result = "I quarter"; }
        else if (x < 0 && y > 0){
            result = "II quarter"; }
        else if (x < 0 && y < 0){
            result = "III quarter"; }
        else if(x > 0 && y < 0){
            result = "IV quarter";}
        else if(x == 0 && y > 0){
            result = "on the axis y between I and II";}
        else if(x == 0 && y < 0){
            result = "on the axis y between III and IV";}
        else if(x > 0 && y == 0){
            result = "on the axis x between I and IV";}
        else if(x < 0 && y == 0){
            result = "on the axis x between II and III";}
        else if(x == 0 && y == 0){
            result = "at the origin";}
        return result;
    }
    public static int showSum(int num1, int num2, int num3){
        int result = 0;
        if (num1 > 0){
           result += num1;
        }
        if (num2 > 0){
            result += num2;
        }
        if (num3 > 0){
            result += num3;
        }
        return result;
    }
    public static int showMax(int num1, int num2, int num3) {
        int result;
        int sum = num1 + num2 + num3;
        int multiply = num1 * num2 * num3;
        if(sum > multiply){
            result = sum + 3;
        } else {
            result = multiply + 3;
        }
        return result;
    }
    public static String getMark(int mark){
        String result = "";
        if (mark >= 0 && mark <= 19) {
            result ="F";
        } else if (mark >= 20 && mark <= 39) {
            result = "E";
        } else if (mark >= 40 && mark <= 59) {
            result = "D";
        } else if (mark >= 60 && mark <= 74) {
            result = "C";
        } else if (mark >= 75 && mark <= 89) {
            result = "B";
        } else if (mark >= 90 && mark <= 100) {
            result = "A";
        }
        if (mark < 0 || mark >100){
            throw new IllegalArgumentException("Число должно быть больше 0 и меньше 100");
        }

        return result;
    }
}



