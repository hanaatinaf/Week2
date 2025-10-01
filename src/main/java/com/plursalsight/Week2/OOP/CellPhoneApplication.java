package com.plursalsight.Week2.OOP;
import  java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cell = display();
        printCell(cell);


    }
    public static CellPhone display(){
        CellPhone cellPhone = new CellPhone();
        Scanner newScanner = new Scanner(System.in);

        System.out.println("What is the serial number?");
        cellPhone.setSerialNumber(newScanner.nextLong());
        newScanner.nextLine();
        System.out.println( "What model is the phone? " );
        cellPhone.setModel(newScanner.nextLine());

        System.out.println("Who is the carrier? " );
        cellPhone.setCarrier(newScanner.nextLine());

        System.out.println("What is the phone number? ");
        cellPhone.setPhoneNumber(newScanner.nextLine());

        System.out.println("Who is the owner of the phone?");
        cellPhone.setOwner(newScanner.nextLine());

        return cellPhone;

    }
    public static void printCell(CellPhone info) {
        System.out.printf("%s is %d years old");
    }
}
