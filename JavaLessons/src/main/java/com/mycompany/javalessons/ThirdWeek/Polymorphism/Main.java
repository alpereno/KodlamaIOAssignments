package com.mycompany.javalessons.ThirdWeek.Polymorphism;

public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new DataBaseLogger(), new FileLogger(), new EmailLogger()};
//        
//        for (BaseLogger logger:loggers) {
//            logger.log("log message");
//        }

        CustomerManager cusomterManager = new CustomerManager(new EmailLogger());
        cusomterManager.add();
        
    }
}
