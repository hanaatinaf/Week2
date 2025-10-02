package com.plursalsight.Week2.OOP;

public class CellPhone {
    private  long  serialNumber;
    private  String model;
    private  String carrier;
    private String phoneNumber ;
    private String  owner ;

    public CellPhone(){
     this.serialNumber = 0;
     this.model= " ";
     this.carrier = " ";
     this.phoneNumber = " " ;
     this.owner = " ";

    }
    public CellPhone(long serialNumber , String model, String carrier, String  phoneNumber, String owner){

    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public  void dial( String ownerNumberCall) {
        System.out.printf("The name: %s ,  is calling phone-parameter %s ", getOwner(),ownerNumberCall);
    }
}
