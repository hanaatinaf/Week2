package com.plursalsight.Week2;
import  java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information:");
        System.out.println("Enter Full name:");
        String fullName = scanner.nextLine();

        System.out.println("Enter Street Address :");
        String streetAddress = scanner.nextLine();

        System.out.println("Enter City :");
        String City = scanner.nextLine();

        System.out.println("Enter State:");
        String State = scanner.nextLine();

        System.out.println("Enter Zip code:\t");
        String Zipcode = scanner.nextLine();

        //System.out.println("Billing City:  " + City);
       // System.out.println("Billing Street: " + streetAddress);
        //System.out.println("Full name: " + fullName);


        // create a StringBuillder object
        StringBuilder skills = new StringBuilder();
        // append strings to the StringBuilder object
        skills.append(fullName + "\n");
        skills.append("Billing Address:\n");
        skills.append( streetAddress + " ");
        skills.append( City + " ," );
        skills.append( State );
        skills.append( " " + Zipcode);
        // retrieve the underlying characters from
        // the StringBuilder
        String mySkills = skills.toString();
        System.out.println( mySkills);



        StringBuilder ShoppingAddress = new StringBuilder();
        ShoppingAddress.append("shipping Address");
        ShoppingAddress.append(streetAddress);
        ShoppingAddress.append(City);
        ShoppingAddress.append(State);
        ShoppingAddress.append(Zipcode);

        String shopAddress = ShoppingAddress.toString();
        System.out.println(shopAddress);



    }
}
