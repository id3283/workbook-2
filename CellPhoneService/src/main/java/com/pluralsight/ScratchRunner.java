package com.pluralsight;

public class ScratchRunner {

    public static void main(String[] args) {
        CellPhone cell1 = new CellPhone();
        cell1.setModel("Andoid");
        cell1.setSerialNumber(1);

        CellPhone cell2 = new CellPhone("Android", 1);

    }
}
