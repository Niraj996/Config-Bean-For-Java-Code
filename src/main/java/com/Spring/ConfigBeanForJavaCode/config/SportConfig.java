package com.Spring.ConfigBeanForJavaCode.config;
// step 1 : is to create config class 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Spring.ConfigBeanForJavaCode.Interface.Coach;
import com.Spring.ConfigBeanForJavaCode.InterfaceImp.SwimCoach;

@Configuration
public class SportConfig {
    
    //Step 2: Create @Bean method to config bean 
    @Bean("anyName") //giving a custome bean id  
    public Coach swimCoach(){   // The bean id defaults to the method name
        return new SwimCoach();
    } 
}
