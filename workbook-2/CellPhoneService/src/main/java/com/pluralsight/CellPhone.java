package com.pluralsight;

public class CellPhone {

    private long serialNumber;

    private String model;

    private String carrier;

    private String phoneNumber;

    private String owner;

    public CellPhone(){
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setmodel(String model) {
        this.model = model;
    }
    public void setcarrier() {
        this.serialNumber = serialNumber;
    }
}
