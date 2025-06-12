package com.bpatel2001.springcoredemo.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Qualifier("BasketballCoach")
// This will create a new object instance for each injection
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class BasketballCoach implements Coach{

    public BasketballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    public String getDailyWorkout(){
        return "Shoot ball lol";
    }
}
