package com.company;
import java.util.Scanner;

public class Randomizer {
    Scanner scanner = new Scanner(System.in);

    public int min, max, randomNumber, uniqueNumbers;;
    public int[] array;
    String command;

    public void start() {
        setMinMax();
        boolean isWorking = true;
        while(isWorking){
            switch(getCommand()) {
                case "generate":
                    do {
                        generateRandomNumber();
                    } while(!isUniqueRandomNumber() && uniqueNumbers != max - min + 1);
                    System.out.println(randomNumber);
                    if(uniqueNumbers == max - min + 1) {
                        System.out.println("There is no more numbers in your range. " +
                                "Make one more try? (yes or no)");
                        command = scanner.next();
                        if(command.equals("no")) {
                            System.out.println("bye bye!");
                            System.exit(0);
                        } else if(command.equals("yes")) {
                            reset();
                            setMinMax();
                        }
                    }
                    break;
                case "exit":
                    System.out.println("Bye-bye!");
                    isWorking = false;
                    System.exit(0);
                case "help":
                    System.out.println("Command 'generate' - generating random number");
                    System.out.println("Command 'exit' - quit app");
                    getCommand();
                default:
                    System.out.println("Wrong command. Please try again");
            }
        }
    }
    public void setMinMax(){
        System.out.println("Enter min number:");
        min = getValidLimit();
        System.out.println("Enter max number:");
        max = getValidLimit();
        System.out.println("min number = " + min + "; max number = " + max);
        array = new int[max - min + 1];
    }

    private int getValidLimit() {
        int limit = 0;
        boolean isValidLimit = false;
        while(!isValidLimit) {
            while(!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Floating point numbers are not allowed. Try again");
            }
            limit = scanner.nextInt();
            if (limit < 1 ) {
                System.out.println("The limit can not be less than 1");
            } else if(limit > 500) {
                System.out.println("The limit can not be more than 500");
            } else {
                isValidLimit = true;
            }
        }
        return limit;
    }

    public void reset() {
        uniqueNumbers = 0;
    }
    public void generateRandomNumber(){
        randomNumber = min + (int)(Math.random() * (max - min + 1));
    }
    public boolean isUniqueRandomNumber() {
        boolean isUnique = true;
        for(int arraySecond : array) {
            if(randomNumber == arraySecond) {
                return false;
            }
        }
        array[uniqueNumbers++] = randomNumber;
        return isUnique;
    }
    public String getCommand(){
        System.out.println("Choose command: generate, exit, help");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        return command;
    }
}