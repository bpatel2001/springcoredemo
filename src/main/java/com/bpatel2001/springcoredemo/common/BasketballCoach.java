package com.bpatel2001.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Qualifier("BasketballCoach")
// This will create a new object instance for each injection
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class BasketballCoach implements Coach{

    public BasketballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    //Define Init method

    @PostConstruct
    public void doStartupStuff(){
        System.out.println("In doStartupStuff(): " + getClass().getSimpleName());
    }

    //Define destroy method - Does not work on prototype beans!

    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("In doCleanupStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Shoot ball lol";
    }
}
