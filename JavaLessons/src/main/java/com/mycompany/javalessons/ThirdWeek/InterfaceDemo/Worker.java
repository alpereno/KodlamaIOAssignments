package com.mycompany.javalessons.ThirdWeek.InterfaceDemo;

public class Worker implements IWorkable, IEatable, IPayable{

    @Override
    public void work() {
        System.out.println("work ");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void pay() {
        System.out.println("pay");
    }
    
}
