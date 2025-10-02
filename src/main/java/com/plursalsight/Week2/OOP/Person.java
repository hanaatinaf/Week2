package com.plursalsight.Week2.OOP;

import java.util.Scanner;

public class Person {
    private  int age ;
    private  String name;

    public Person(){};
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public  void  setAge(int age){
        if (age >= 0){
            this.age = age;
        }
        else {
            System.out.println("Your age should be grater than 0 ");
        }

    }

    public static class Appointment {
    }

    public static class CellPhone {
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




        public void overlodsConstructors(long  serialNumber, String model, String carrier,
                                         String phoneNumber ,String  owner ){

        }

    }

    public static class CellPhoneApplication {
        public static void main(String[] args) {
            Scanner newScanner = new Scanner(System.in);

           //CellPhone cell = display();
           // printCell(cell);

            CellPhone cellphone1 = new CellPhone() ;

            CellPhone cellphone2 = new CellPhone() ;

           // cellphone 1
            System.out.println("Who is the owner of the phone?");
            cellphone1.setOwner(newScanner.nextLine());
            System.out.println("What is the phone number? ");
            cellphone1.setPhoneNumber(newScanner.nextLine());


            // cellphone 2
            System.out.println("Who is the owner of the phone?");
            cellphone2.setOwner(newScanner.nextLine());
            System.out.println("What is the phone number? ");
            cellphone2.setPhoneNumber(newScanner.nextLine());

            //cellphone1.dial("855-555-2222");
            display( cellphone1);
            display(cellphone2);
            cellphone1.dial(cellphone2.getPhoneNumber());// phone1 call phone 2 num
            cellphone2.dial(cellphone1.getPhoneNumber());//phone2  call phone 1 num


        }
        /*public static CellPhone display(){
            CellPhone cellPhone = new CellPhone();
            Scanner newScanner = new Scanner(System.in);

            System.out.println("What is the serial number?");
           /1 cellPhone.setSerialNumber(newScanner.nextLong());
            newScanner.nextLine();
            System.out.println( "What model is the phone? " );
           /2 cellPhone.setModel(newScanner.nextLine());

            System.out.println("Who is the carrier? " );
            /3 cellPhone.setCarrier(newScanner.nextLine());

            System.out.println("What is the phone number? ");
            /4 cellPhone.setPhoneNumber(newScanner.nextLine());

            System.out.println("Who is the owner of the phone?");
           / 5  cellPhone.setOwner(newScanner.nextLine());

            return cellPhone;

        }
        public static void printCell(CellPhone info) {
            //System.out.println("Hana:" + info.getSerialNumber());
            //System.out.printf("%d, %s,%s,%s,%s",info.getSerialNumber(),info.getModel(),info.getCarrier(),info.getPhoneNumber(),info.getOwner());
        }*/


        public static void display(CellPhone phone) {
            System.out.printf("%s , %s",phone.getOwner(),phone.getPhoneNumber());

        }



    }
}
