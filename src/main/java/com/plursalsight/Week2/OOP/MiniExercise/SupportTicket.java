package com.plursalsight.Week2.OOP.MiniExercise;

import java.time.LocalDate;

public class SupportTicket {
    private  String reporter;
    private String assignee;
    private String subject;
    private  String description;
    private LocalDate createdOn ;
    private String status;

    //Constructors No-args. All-args.
    public  SupportTicket(){}

    public  SupportTicket(String reporter
   ,String assignee,String subject ,String description,LocalDate createdOn ,String status){
       this.reporter = reporter;
        this.assignee = assignee;
        this.subject = subject;
        this.description = description;
        this.createdOn  = createdOn;
        this.status = status;}

    public String getReporter() {return reporter;}

    public void setReporter(String reporter) {this.reporter = reporter;}

    public String getAssignee() {return assignee;}

    public void setAssignee(String assignee) {this.assignee = assignee;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getSubject() {return subject; }

    public void setSubject(String subject) {this.subject = subject; }

    public LocalDate getCreatedOn() { return createdOn; }

    public void setCreatedOn(LocalDate createdOn) { this.createdOn = createdOn; }
    public String getStatus() { return status; }
    public void setStatus(String status) {
        if (status == "OPEN" || status == "IN_PROGRESS" || status == "RESOLVED") {
           this.status = status;
        }else { this.status = "OPEN";}
    }

    public void printSummary(){
        System.out.printf("[<%s>]  on <%s> -  <%s> (reported by <%s> , assigned to  <%s> \n ",createdOn,subject,status,reporter,assignee);
    }
}
