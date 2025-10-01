package com.plursalsight.Week2;
import  java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {
        //Creates a Scanner object to read input from the console (keyboard)
        Scanner scanner = new Scanner(System.in);

        // user information
        //Reads the user's full name and stores it in the fullName variable
        System.out.println("Please provide the following information:");
        System.out.println("Full name: ");
        String fullName = scanner.nextLine();



        //Calls the getAddress method twice to collect billing and shipping addresses

        // Passes the scanner and address type ("Billing"/"Shipping") as parameters*/

        String BillingAddress = getAddress(scanner , "Billing");
        String ShippingAddress = getAddress(scanner , "Shipping");




        //Creates a StringBuilder object to efficiently build the final output string
        //Appends all collected information with proper formatting and line breaks

        StringBuilder skills = new StringBuilder();
        //append to the StringBuilder object
        skills.append(fullName + " \n ");
        skills.append("Billing Address: \n ");
        skills.append( BillingAddress  + " \n ");

        skills.append("Shipping Address: \n ");
        skills.append( ShippingAddress );

        //Converts the StringBuilder to a String and
        // prints the complete address information
        System.out.println(skills.toString());

    }

    //this method is called twice - once for billing and once for shipping address.
    public static  String getAddress(Scanner scanner , String info){
        /*Prompts user for each address (street, city, state, zip)
        The info parameter determines if it's for "Billing" or "Shipping"
        Stores each component in separate variables*/

        System.out.println(info + " Street");
        String streetAddress = scanner.nextLine();

        System.out.println(info+  " City:");
        String City = scanner.nextLine();

        System.out.println(info + " State:");
        String State = scanner.nextLine();

        System.out.println( info + " Zip:");
        String Zipcode = scanner.nextLine();

        /*Creates a StringBuilder to format the address
        Combines all components into a properly formatted address string
        Returns the complete address as a String*/

        StringBuilder address = new StringBuilder();
        address.append(streetAddress + " \n");
        address.append(City + ",");
        address.append(State + " ");
        address.append(Zipcode) ;
        return address.toString();

    }
}
