package com.mycompany.javalessons.ThirdWeek.Interfaces;

public class CustomerManager {
    private ICustomerDal customerDal;
    
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    
    // burada is kodlari yazilir. add ile gelen parametrelerde isim dogru yazilmis mi falan onlar kontrol edilir
    public void add(){
        customerDal.add();
    }
}
