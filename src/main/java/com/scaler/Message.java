package com.scaler;

import java.util.Calendar;

public class Message {
    Greeting greeting;
    Calendar calendar;
    Message(){}

    public Message(Calendar calendar) {
        this.calendar = calendar;
        int hourOfDay = this.calendar.get(Calendar.HOUR_OF_DAY);
        if(hourOfDay < 12){
            this.greeting = Greeting.MORNING;
        }
        else if(hourOfDay < 17){
            this.greeting = Greeting.AFTERNOON;
        }
        else{
            this.greeting = Greeting.EVENING;
        }
    }

    public Greeting getGreeting() {
        return greeting;
    }

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
