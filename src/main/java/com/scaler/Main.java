package com.scaler;

import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Message message = new Message(Calendar.getInstance(Locale.getDefault()));
        System.out.println("Good " + message.getGreeting().toString() + " World!");
    }
}