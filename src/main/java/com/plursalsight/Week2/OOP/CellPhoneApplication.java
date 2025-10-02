package com.plursalsight.Week2.OOP;
import  java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

       //CellPhone cell = display();
      // printCell(cell);

        CellPhone cellphone1 = new CellPhone() ;
        CellPhone cellphone2 = new CellPhone() ;
      // cellphone 2
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
        //System.out.println("Hana:" + info.getSerialNumber());
        //System.out.printf("%d, %s,%s,%s,%s",info.getSerialNumber(),info.getModel(),info.getCarrier(),info.getPhoneNumber(),info.getOwner());
    }*/


    public static void display(CellPhone phone) {
        System.out.printf("%s , %s",phone.getOwner(),phone.getPhoneNumber());

    }


}
