package com.plursalsight.Week2.OOP;
import java.util.Scanner;

public class PersonApp {

    public static void main(String[] args) {
        Person p = createNewObject();
        System.out.println(p);

    }

    public  static  Person createNewObject(){
        Person person  = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is Your name:");
        person.setName(scanner.nextLine());
        System.out.println("What is Your name:");
        person.setAge(scanner.nextInt());
        scanner.nextLine();

        return person;
    }
    public static void printPerson(Person person){
        System.out.printf("%s is %d years old ", person.getName(),person.getAge());
    }

}
