package com.company;

import java.util.Random;

public class RandomHW {


    public static void getRandomNumber() {

        System.out.println(new Random().nextInt());
    }

    public static void getTenRandomNumbers(){
        int amount = 10;
        for (int i = 0; i < amount; i++) {
            System.out.println(new Random().nextInt());
        }
    }

    public static void getRandomNumber_0_10(){
        int amount = 10;
        for (int i = 0; i < amount; i++) {
            System.out.println(new Random().nextInt(11));
        }
    }

    public static void getRandomNumber_20_50(){
        int amount = 10;
        for (int i = 0; i < amount; i++) {
            System.out.println(new Random().nextInt(31) + 20);
        }
    }

    public static void getRandomNumberMinus10_10(){
        int amount = 10;
        for (int i = 0; i < amount; i++) {
            System.out.println(new Random().nextInt(21) -10);
        }
    }

    public static void getRandomNumberMinus10_35(){
        int amount = new Random().nextInt(13) + 3;
        for (int i = 0; i < amount; i++) {
            System.out.println(new Random().nextInt(46) -10);
        }

    }
}
