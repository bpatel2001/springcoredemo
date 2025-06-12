package com.bpatel2001.springcoredemo.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("Basketball")
@Component
public class BasketballCoach implements Coach{
    public String getDailyWorkout(){
        return "Shoot ball lol";
    }
}
