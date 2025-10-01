package com.plursalsight.Week2;
import  java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // user information
        System.out.println("Please provide the following information:");
        System.out.println("Full name: ");
        String fullName = scanner.nextLine();

        String BillingAddress = getAddress(scanner , "Billing");
        String ShippingAddress = getAddress(scanner , "Shipping");

        // create a StringBuillder object
        StringBuilder skills = new StringBuilder();
        // append to the StringBuilder object
        skills.append(fullName + " \n ");
        skills.append("Billing Address: \n ");
        skills.append( BillingAddress  + " \n ");

        skills.append("Shipping Address: \n ");
        skills.append( ShippingAddress );

        System.out.println(skills.toString());

    }

    public static  String getAddress(Scanner scanner , String info){
        System.out.println(info + " Street");
        String streetAddress = scanner.nextLine();

        System.out.println(info+  " City:");
        String City = scanner.nextLine();

        System.out.println(info + " State:");
        String State = scanner.nextLine();

        System.out.println( info + " Zip:");
        String Zipcode = scanner.nextLine();

        // // create a StringBuillder object
        StringBuilder address = new StringBuilder();
        address.append(streetAddress + " \n");
        address.append(City + ",");
        address.append(State + " ");
        address.append(Zipcode) ;
        return address.toString();

    }
}
