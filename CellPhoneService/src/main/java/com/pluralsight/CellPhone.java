package com.pluralsight;

public class CellPhone {
    private int serialNumber;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    private String model;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
    }

}
