package com.company;


public class MyMath {
    public static void main(String[] args) {
        System.out.println(method4(5));
    }

    public static double getDistanceRadians(int angle, double velocity){
        double distance = Math.abs((velocity * velocity) / 9.8) * Math.sin(Math.toRadians(2 * angle));

        return distance;
    }

    public static double getDistanceDegree(int angle, double velocity){
        double distance = Math.abs((velocity * velocity) / 9.8) * Math.sin((2 * angle));

        return distance;
    }

    public static double carDistance(double velocity1, double velocity2, double distance, double time){
        double result;
        return result = (velocity1 * time) + (velocity2 * time) + distance;
    }

    void isInside( double x,double y){
        if(  (x >= 0) && (y >= 1.5 * (x -1) && (y <= x)||(x <= 0) && (y >= -1.5 * x-1) && (y <= -x))){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static double method4(int x){
        double numerator = Math.exp(x + 1) + 2 * Math.exp(x) * Math.cos(x);
        double denominator = x - Math.exp(x + 1) * Math.sin(x);
        double fraction = Math.abs(Math.cos(x) / Math.exp(Math.sin(x)));
        double result = 6 * Math.log(Math.sqrt(numerator)) / Math.log(denominator) + fraction;
        return result;
    }
}

