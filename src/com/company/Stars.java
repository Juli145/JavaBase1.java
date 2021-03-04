package com.company;

public class Stars {

    public static void main(String[] args) {
        int count = 7;
        System.out.println(1);
        for (int h = 0; h < count; h++) {
            for (int v = 0; v < count; v++) {
                System.out.print("*  ");
            }
            System.out.println(" ");
        }

        System.out.println(2);
        for (int h = 0; h < count; h++) {
            for (int v = 0; v < count; v++) {
                if (h == 0 || h == count - 1 || v == 0 || v == count - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("  ");
        }

        System.out.println(3);
        int count1 = 6;
        for (int h = 0; h < count; h++) {
            for (int v = 0; v < count; v++) {
                if (h == 0 || v == 0 || v == count1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("  ");
            count1--;
        }

        System.out.println(4);
        int count2 = 0;
        for (int h = 0; h < count; h++) {
            for (int v = 0; v < count; v++) {
                if (h == 6 || v == 0 || v == count2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("  ");
            count2++;
        }

        System.out.println(5);
        count1 = 6;
        for (int h = 0; h < count; h++) {
            for (int v = 0; v < count; v++) {
                if (h == 6 || v == 6 || v == count1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("  ");
            count1--;
        }

        System.out.println(6);
        count2 = 0;
        for (int h = 0; h < count; h++) {
            for (int v = 0; v < count; v++) {
                if (h == 0 || v == 6 || v == count2) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("  ");
            count2++;
        }

        System.out.println(7);
        count1 = 6;
        count2 = 0;
        for (int h = 0; h < 7; h++) {
            for (int v = 0; v < 7; v++) {
                if (v == count2 || v == count1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("  ");
            count2++;
            count1--;
        }

        System.out.println(8);
        count1 = 6;
        count2 = 0;
        int center = 4;
        for (int h = 0; h < center; h++) {
            for (int v = 0; v < 7; v++) {
                if (v == count2 || v == count1 || h == 0) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("  ");
            count2++;
            count1--;

        }

        System.out.println(9);
        count1 = 3;
        count2 = 3;
        for (int i = 3; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 6 || j == count2 || j == count1) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
            count1--;
            count2++;
        }
    }
}


