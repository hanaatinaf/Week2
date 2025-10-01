package com.plursalsight.Week2.OOP;

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
}
