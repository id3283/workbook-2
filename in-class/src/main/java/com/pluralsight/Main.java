package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        formattingDates();
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
        String name = "Alex Leal|Victoria Babalola";

        String[] nameParts = name.split(Pattern.quote("|"));

        System.out.println("First name: " + nameParts[0]);
        System.out.println("Last name: " + nameParts[1]);
    }
}