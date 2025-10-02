package com.plursalsight.Week2.OOP.MiniExercise;

import java.time.LocalDate;

public class AppointmentApp {
    public static void main(String[] args) {
        Appointment appointemnts1 = new Appointment("dental appointment", "Denver health" , "Hana " , LocalDate.now(),"706 hanover st ");
        appointemnts1.printDetails();
    }
}
