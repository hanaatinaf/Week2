package com.plursalsight.Week2.OOP.MiniExercise;

import java.time.LocalDate;

public class SupportTicketApp {
    public static void main(String[] args) {
        SupportTicket noArgs = new SupportTicket();
        noArgs.printSummary();


        SupportTicket withAllArgs = new SupportTicket("Hana","Beza","About OOPS","this is the project we working on",
                LocalDate.now(),"IN_PROGRESS");
        withAllArgs.printSummary();


        SupportTicket withAllArgs1 = new SupportTicket("Hana","Beza","About OOPS","this is the project we working on",
                LocalDate.now(),"RESOLVED");
        withAllArgs1.printSummary();




    }
}
