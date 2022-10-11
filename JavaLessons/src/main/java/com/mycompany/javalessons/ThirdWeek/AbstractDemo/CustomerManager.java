package com.mycompany.javalessons.ThirdWeek.AbstractDemo;

public class CustomerManager {
    // Strategy pattern    
    BaseDataBaseManager baseDataBaseManager;
    
    public void getCustomers(){
        baseDataBaseManager.getData();
    }
}
