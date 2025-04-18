package com.pluralsight;

public class CellPhone {
    public int serialNumber;
    private String model;

    public CellPhone() {
    }

    public CellPhone(String model, int serialNumber) {
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public void displayInfo() {
        System.out.println("Model: " + this.model);
    }

    public void displayInfo(CellPhone x) {
        System.out.println("Model: " + x.model);
    }


    //region  darn getters and freakin' setters
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    //endregion

}
