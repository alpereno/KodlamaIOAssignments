package com.mycompany.javalessons.ThirdWeek.Polymorphism;

public class CustomerManager {
    private BaseLogger logger;
     
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("Customer has been added");
        // log message could be "logged + customer's name"
        logger.log("log message");
    }
}
