package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        intentionalErrorsNoReallyIntentional();
    }

    static void intentionalErrorsNoReallyIntentional() {
        String[] names =  {"Kevin", "Mahlet"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer (nothing else... it's important!)");

        int i = 0;
        try {
            i = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("That wasn't an integer, I said it was important!");
            e.printStackTrace();
        }

        System.out.println("Here is the integer: " + i);


//        } catch (Exception e) {
//            System.out.println("Here's the exception: " + e);
//            System.out.println("Meh, whatever... I'm just going to carry on.");
//        }

    }

    static void parseProblem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer to be scanned with nextInt: ");
//        int firstInt = scanner.nextInt();
        String userInput = scanner.nextLine();
        int firstInt = Integer.parseInt(userInput);

        System.out.println("Enter a string (or try to!): ");
        String inputString = scanner.nextLine();

        System.out.println("You entered " + firstInt + " " + "followed by: " + inputString);
    }

    static void errorMethod() {

        int[] ageArray = {56, 22, 33};
        for (int i = 0; i < 57; i++) {
            System.out.println(ageArray[i]);

        }
    }

    static void loopsAndArrays() {
        int[] ageArray = {56, 22, 33};
        int[] secondArray;
//        secondArray = nameArray;
        secondArray = myCopy(ageArray);

        int[] thirdArray = new int[ageArray.length];
        System.arraycopy(ageArray, 0, thirdArray, 0, ageArray.length);

//        String karyna = "Karyna";
//        printName(karyna);

//        for (int i = 0; i < nameArray.length; i++) {
//            System.out.println("string at " + i + ": " + nameArray[i]);
//        }
//
//        for (String name: nameArray) {
//            System.out.println("Here is the name: " + name);
//        }
    }

    public static int[] myCopy(int[] og) {
        int[] newG = new int[og.length];

        for (int i = 0; i < og.length; i++) {
            newG[i] = og[i];
        }

        return newG;
    }

    public static void printName(String x) {
        System.out.println("name: " + x);
    }

    static void stringBuilder() {

        StringBuilder name = new StringBuilder();
        name.append("Dave");
        name.append("\n");

        name.append("Izel").append("\n");

        String nameString = name.toString();
    }

    static void exercise212() {
        String name1 = " Dave Dykes  ";
        name1 = name1.trim();

        String[] parts = name1.split(" ");

        System.out.println("First name: " + parts[0]);
        if (parts.length == 2) {
            System.out.println("Last name: " + parts[1]);
        } else {
            System.out.println("Middle name (initial): " + parts[1]);
            System.out.println("Last name: " + parts[2]);
        }
    }

    static void formattingDates() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

//        String dateString = "2025-04-16";
//        LocalDate date = LocalDate.parse(dateString);

        String dateString = "04/16/2025";
        LocalDate date = LocalDate.parse(dateString, formatter);

        System.out.println("Here's the date variable: " + date);
        System.out.println("Here's it's type: " + date.getClass());
    }

    static void usingSplit() {
        String name = "Alex Leal|David Disu";

        String delimiter = "\\|";
        String p = Pattern.quote("|");

        String[] nameParts = name.split(delimiter);

        System.out.println("First element: " + nameParts[0]);
        System.out.println("Second element: " + nameParts[1]);
    }

}