package com.scaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class MessageTest {
    @Test
    public void messageTest(){
        Calendar cal_10_am = new Calendar.Builder().setTimeOfDay(10, 0,0).build();
        Calendar cal_12_pm = new Calendar.Builder().setTimeOfDay(12,0,0).build();
        Calendar cal_10_pm = new Calendar.Builder().setTimeOfDay(22,0,0).build();

        Assertions.assertEquals(Greeting.MORNING, new Message(cal_10_am).getGreeting());
        Assertions.assertEquals(Greeting.AFTERNOON, new Message(cal_12_pm).getGreeting());
        Assertions.assertEquals(Greeting.EVENING, new Message(cal_10_pm).getGreeting());
    }
}
