package com.plursalsight.Week2.OOP.MiniExercise;

import java.time.LocalDate;

public class TextMessageApp {
    public static void main(String[] args) {
        TextMessage text1 = new TextMessage("+31611111111","+31622222222", "On my way!" ,LocalDate.now() );
        text1.display();


        // if i use Sacnner use this
        TextMessage text2 = new TextMessage();
        text2.setSenderNumber("+72028787287");
        text2.setReceiverNumber("+21566527621");
        text2.setBody("Hey this Hana!");
        text2.setSentOn(LocalDate.now());
        text2.display();



           /*TextMessage text1 = new TextMessage();
        text1.setSenderNumber("+31611111111");
        text1.setReceiverNumber("+31622222222");
        text1.setBody("On my way!");
        text1.setSentOn(LocalDate.now());
       /* System.out.println(text1.getSenderNumber());
        System.out.println(text1.getReceiverNumber());
        System.out.println(text1.getBody());
        System.out.println(text1.getSentOn());*/




    }
}
