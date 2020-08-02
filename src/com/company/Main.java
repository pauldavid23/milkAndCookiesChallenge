package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter month");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter day: ");
        int day = scanner.nextInt();
        scanner.nextLine();

        switch (month) {
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11:
                System.out.println("It is not Christmas!");
                break;
            case 12:
                if (day == 24) {
                    System.out.println("It's Christmas!");
                } else {
                    System.out.println("It's December but it's not Christmas eve yet!");
                }
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }












    }
}
