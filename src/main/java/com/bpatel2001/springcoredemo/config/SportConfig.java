package com.bpatel2001.springcoredemo.config;

import com.bpatel2001.springcoredemo.common.Coach;
import com.bpatel2001.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//Using Bean annotation to take an existing third-party class and expose it as a Spring Bean.
public class SportConfig {

//  Configure SwimCoach as a Spring Bean
    @Bean("aquatic") // You can provide an ID to the Bean
//  Bean ID defaults to the method name
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
