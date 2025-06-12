package com.bpatel2001.springcoredemo.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("BasketballCoach")
@Component
public class BasketballCoach implements Coach{

    public BasketballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    public String getDailyWorkout(){
        return "Shoot ball lol";
    }
}
