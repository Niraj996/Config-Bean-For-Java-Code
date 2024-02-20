package com.Spring.ConfigBeanForJavaCode.InterfaceImp;

import com.Spring.ConfigBeanForJavaCode.Interface.Coach;

// Here we don't have @Component anotation on purpose
// not including @component we will get error cuz app will not find it .. but hav alternate
public class SwimCoach implements Coach {

    public SwimCoach () {
        System.out.println("In constructor: " +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
    return "Swim 1000 meters as a warm up";    
    }
    
}
