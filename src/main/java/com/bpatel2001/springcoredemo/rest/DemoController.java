package com.bpatel2001.springcoredemo.rest;

import com.bpatel2001.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

//    Field Injection (Not recommended as its bad for testing)
//    @Autowired
//    private Coach myCoach;

    //Setter Injection (You can set the function name to whatever you want as a function of Autowired annotation)
//    @Autowired
//    public void setCoach(Coach theCoach) {
//        myCoach = theCoach;
//    }

    //Constructor Injection (Most recommended)
    @Autowired
//    Qualifier annotation to use "Basketball" as the qualifier for the DemoController
    public DemoController(@Qualifier("BasketballCoach") Coach theCoach){
//      This would only show the bean that gets created due to lazy loading and the DemoController:
//      In constructor: BasketballCoach
//      In constructor: DemoController
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
