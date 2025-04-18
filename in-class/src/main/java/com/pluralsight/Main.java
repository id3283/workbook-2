package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        loopsAndArrays();
    }

    static void loopsAndArrays() {
        int[] integerArray = new int[5];
        String[] stringArray = {"Izel", "Victoria", "Noah"};

        for (int i = 0; i < 3; i++) {
            System.out.println("string at " + i + ": " + stringArray[i]);
        }


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