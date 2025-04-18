package com.pluralsight;


public class CellPhoneApplication {

    public static void main(String[] args) {

        CellPhone phone = new CellPhone();
        phone.setModel("myPhone");
        phone.serialNumber = 3;

        CellPhone anotherPhone = new CellPhone("Android", 55);

        CellPhone yetAnotherPhone;
        yetAnotherPhone = new CellPhone();

        yetAnotherPhone.setModel("yet another model") ;

        yetAnotherPhone.displayInfo();

        display(yetAnotherPhone);

    }
    public static void display(CellPhone phone) {
    }
}
