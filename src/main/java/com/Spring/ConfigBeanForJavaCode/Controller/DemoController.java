package com.Spring.ConfigBeanForJavaCode.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.ConfigBeanForJavaCode.Interface.Coach;

@RestController
public class DemoController {
    // define a private field for the dependency 

    private Coach myCoach;
   

    //define a constructor for dependency injection

    @Autowired  // Constructor Injection
    public DemoController(
        @Qualifier ("anyName") Coach theCoach) //custome name from bean
        {
        System.out.println("In Constructor: " +getClass().getSimpleName());  
        myCoach= theCoach;                                          
        }
        //@Bean use case 
            //Take existing third-party class and expose as a Spring bean 
        

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }




}
