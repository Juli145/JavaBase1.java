package com.company;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public int min = 1;
    public int max = 200;
    public int secretNumber, userAttempt = 5, userGuess, userTry = 0, difference;
    public Scanner scanner;

    public void start() {
        Scanner scanner = new Scanner(System.in);


        secretNumber = new Random().nextInt(201);
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

}

