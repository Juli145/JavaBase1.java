package com.company;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);

    public int min = 1, max = 200;
    public int secretNumber, userAttempt = 5, userGuess = 0, userTry = 0, difference;


    public void start() {
        setRange();

        secretNumber = new Random().nextInt(max + 1);
        System.out.println(secretNumber);

        System.out.println(String.format("Hi, I have a number from %s to %s in your range. Try to guess it in 5 tries!", min, max));

        while (userAttempt != 0) {
            userGuess = scanner.nextInt();
            compareNumbers();
            if (userAttempt == 0) {
                System.out.println(String.format("It was %s. Bye-bye!", secretNumber));
                System.exit(0);
            }
            if (scanner.next().equals("exit")) {
                System.out.println("Bye-bye!");
                System.exit(0);
            }
        }
    }


    public void compareNumbers(){
        if (userGuess == secretNumber) {
            System.out.println(String.format("Congratulations! You guessed the number in %s attempt(s)", ++userTry));
            System.exit(0);
        } else if(userTry == 0){
            difference = Math.abs(secretNumber - userGuess);
            userTry++;
            System.out.println(String.format("Try again! %s attempt(s) left", --userAttempt));
        } else if (Math.abs(secretNumber-userGuess) < difference){
            userTry++;
            System.out.println(String.format("Wrong, but warmer! %s attempt(s) left", --userAttempt));
        } else if (Math.abs(secretNumber-userGuess) > difference){
            userTry++;
            System.out.println(String.format("Wrong and colder! %s attempt(s) left", --userAttempt));
        }  else if(Math.abs(secretNumber - userGuess) == difference) {
            userTry++;
            System.out.println(String.format("Try again! %s attempt(s) left", --userAttempt));
        }
    }

    public void setRange(){
        System.out.println(String.format("Choose the range. From %s to %s", min, max ));
        System.out.println("Enter min number");
        min = scanner.nextInt();
        System.out.println("Enter max number");
        max = scanner.nextInt();

        if(min < 0 || max > 200|| min>max) {
            System.out.println("You entered wrong rang. It should be more than 1 and less than 200 (min could not be more than max). Try again");
            start();
        } else{
            System.out.println(String.format("You range is from %s to %s", min, max));
        }
    }
}

