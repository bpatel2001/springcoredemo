package com.bpatel2001.springcoredemo.common;

//Not using @Component on purpose as it will use a config file in order to implement this as a bean
public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
