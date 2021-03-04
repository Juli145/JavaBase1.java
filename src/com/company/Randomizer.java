package com.company;
import java.util.Scanner;

public class Randomizer {

    public int min;
    public int max;
    boolean isWorking = true;

    public void start() {
        setMinMax();
        boolean isWorking = true;
        while(isWorking){
            System.out.println("Choose command: generate, exit, help");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.next();
            if (command.equals("generate")) {
                int[] array = new int[max - min + 1];
                int index = 0;
                System.out.println("min number = " + min + "; max number = " + max);
                int randomNumber = (int) (min + (Math.random() * max));
                array[index++] = randomNumber;
                System.out.println("random number = " + randomNumber);
            } else if (command.equals("exit")) {
                System.out.println("Bye-bye!");
                isWorking = false;
                System.exit(0);
            } else if (command.equals("help")) {
                System.out.println("Command 'generate' - generating random number");
                System.out.println("Command 'exit' - quit app");
            } else {
                System.out.println("Wrong command. Please try again");
            }
        }
    }
    public void setMinMax(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter min number:");
        min = scanner.nextInt();
        System.out.println("Enter max number:");
        max = scanner.nextInt();
        if (min <= 1 || max >= 500) {
            System.out.println("Min number should be more than 0. Max number should be equal or less than 500 ");
        }
    }

}