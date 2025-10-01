package com.plursalsight.Week2;
import  java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine().trim();
        System.out.println("Enter your middele name:");
        String middleName = scanner.nextLine().trim();
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine().trim();
        System.out.println("Enter your suffix (like Jr, PhD, III - or press Enter for none):");
        String suffix = scanner.nextLine().trim();
        String fullName = firstName ;

        if (!middleName.isEmpty()){
            fullName = fullName + " " + middleName   ;
        }
        fullName = fullName + " " + lastName;
        if (!suffix.isEmpty()) {
            fullName = fullName + ", " +  suffix;

        }
        System.out.println("Full name: "+ fullName);


    }
}
