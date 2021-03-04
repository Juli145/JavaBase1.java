package com.company;


public class Functions {

    public static String getDayByNumber(int dayNumber) {
        String dayOFWeek = "";
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Sunday";
        }
    }

    public static int getDistance(int x1, int y1, int x2, int y2) {
        return (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }


    public static String[] numbers1_9  = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    public static String[] numbers11_19 = {"одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
            "семнадцать", "восемнадцать", "девятнадцать"};
    public static String[] numbersTens = {"десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
            "восемьдесят", "девяносто"};
    public static String[] numbersHundreds = {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
            "восемьсот", "девятьсот"};

    public static String getStringByNumber(int number) {
        if (number == 0) {
            return "ноль";
        }
        String spelledNumber = " ";
        int digit, counter = 0;
        boolean isBelow20 = false;

        while (number != 0) {
            digit = number % 10;
            number /= 10;
            if(digit != 0 && counter == 0) {
                if(number % 10 == 1) {
                    spelledNumber += numbers11_19[digit - 1] + " ";
                    isBelow20 = true;
                } else {
                    spelledNumber += numbers1_9[digit - 1] + " ";
                }
            } else if(digit > 0 && !isBelow20 && counter == 1) {
                spelledNumber += numbersTens[digit - 1] + " ";
            } else if(counter == 2) {
                spelledNumber += numbersHundreds[digit - 1] + " ";
            }
            counter++;
        }

        String[] temp = spelledNumber.split(" ");
        spelledNumber = "";
        for(int i = temp.length - 1; i >= 0; i--) {
            spelledNumber += temp[i] + " ";
        }

        return spelledNumber;
    }

    public static int getNumberByString(String number){
        String lowerCase = number.toLowerCase().trim().replaceAll("\\s+", " ");
        String[] splitNumber = lowerCase.split(" ");

        if(splitNumber[0].equals("ноль")) {
            return 0;
        }
        int convertedNumber = 0;
        int wordsCounter = splitNumber.length;
        while(wordsCounter != 0) {
            for(int i = 0; i < numbers1_9.length && wordsCounter != 0; i++) {
                if(splitNumber[splitNumber.length - wordsCounter].equals(numbersHundreds[i])) {
                    convertedNumber += (i + 1) * 100;
                    wordsCounter--;
                    break;
                } else if (splitNumber[splitNumber.length - wordsCounter].equals(numbersTens[i])) {
                    convertedNumber += (i + 1) * 10;
                    wordsCounter--;
                    break;
                } else if(splitNumber[splitNumber.length - wordsCounter].equals(numbers11_19[i])) {
                    convertedNumber += i + 11;
                    wordsCounter--;
                    break;
                } else if (splitNumber[splitNumber.length - wordsCounter].equals(numbers1_9[i])) {
                    convertedNumber += i + 1;
                    wordsCounter--;
                    break;
                }
            }
        }
        return convertedNumber;
    }
}

