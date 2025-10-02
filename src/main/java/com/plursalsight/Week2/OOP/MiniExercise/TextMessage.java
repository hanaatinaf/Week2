package com.plursalsight.Week2.OOP.MiniExercise;
import java.time.LocalDate;

public class TextMessage {
    // private member
    private String senderNumber;
    private String receiverNumber;
    private String body;
    private LocalDate sentOn;


   public TextMessage(){}; //No-args constructor.
    //All-args constructor with parameters for all fields.
    public TextMessage( String senderNumber, String receiverNumber ,String body, LocalDate sentOn){

        this.senderNumber = senderNumber;
        this.receiverNumber= receiverNumber;
        this.body = body ;
        this.sentOn = sentOn;


    }

    String getSenderNumber() {
        return senderNumber;
    }

    public void setSenderNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    public String getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(String receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        if (body == null || body.isEmpty()){
            this.body = ("--empty--");

        }else {
            this.body = body;
        }
    }

    public LocalDate getSentOn() {
        return sentOn;
    }

    public void setSentOn(LocalDate sentOn) {
        this.sentOn = sentOn;
    }

    public void display(){
        //[sentOn] SMS from <senderNumber> to <receiverNumber>: <body>
        System.out.printf(" [%s] SMS from <%s> to <%s> : <%s> \n " ,sentOn, senderNumber,receiverNumber,body);

    }
}
