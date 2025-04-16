package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        CellPhone phone = new CellPhone();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter serial number: ");
        String input = scanner.nextLine();
        int serialNumber = Integer.parseInt(input);

        phone.setSerialNumber(serialNumber);

        System.out.print("Enter model: ");
        input = scanner.nextLine();

        phone.setModel(input);

        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
    }
}
