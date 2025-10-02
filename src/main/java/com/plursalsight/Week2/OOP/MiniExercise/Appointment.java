package com.plursalsight.Week2.OOP.MiniExercise;
import java.time.LocalDate;

public class Appointment {
    // private member
    private String title ;
    private String organizer ;
    private String attendee ;
    private  LocalDate date;
    private  String location;

    //No-args.
    public Appointment(){}
    // All-args
    public Appointment(String title ,String organizer, String attendee , LocalDate date, String location){
        this.title  = title;
        this.organizer = organizer  ;
        this.attendee  = attendee;
        this.date = date;
        this.location = location;}

    // setters and getters
    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getOrganizer() {return organizer;}

    public void setOrganizer(String organizer) {this.organizer = organizer;}

    public String getAttendee() {return attendee;}

    public void setAttendee(String attendee) {this.attendee = attendee;}

    public LocalDate getDate() {return date;}

    public void setDate(LocalDate date) {this.date = date;}

    public String getLocation() {return location;}

    public void setLocation(String location) {
        //In setLocation, if location is null or blank, set to "TBD"
        if (location == null || location == " " ){
            this.location = "TBD";
        }else {this.location = location;}


    }
    public void printDetails(){
        System.out.printf("<%s>  on <%s> at <%s> (Organizer: <%s> , attendee: <%s> \n ",title,date,location,organizer,attendee);
    }
}
