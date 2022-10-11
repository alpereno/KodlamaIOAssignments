package com.mycompany.javalessons.ThirdWeek.OOPStream;

public class CustomerManager {
    private Customer customer;
    private ICreditManager creditManager;
    
    public CustomerManager(Customer customer, ICreditManager creditManager){
        this.customer = customer;
        this.creditManager = creditManager;
    }
    
    
    public void save(){
        System.out.println("customer saved = " + customer.id);
    }
    
    public void giveCredit(){
        creditManager.calculate();
        creditManager.save();
        System.out.println("credit has been given");
    }    
}
