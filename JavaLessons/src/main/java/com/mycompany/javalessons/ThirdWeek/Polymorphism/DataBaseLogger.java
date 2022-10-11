package com.mycompany.javalessons.ThirdWeek.Polymorphism;

public class DataBaseLogger extends BaseLogger{
    @Override
    public void log(String message){
        System.out.println("Logged to DataBase = " + message);
    }
}
