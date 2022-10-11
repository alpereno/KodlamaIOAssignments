package com.mycompany.javalessons.ThirdWeek.Overriding;

public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] creditManagers = new BaseCreditManager[]{new AgricultureCreditManager(), 
            new TeacherCreditManager(), new StudentCreditManager()};
        
        for (BaseCreditManager creditMngr : creditManagers) {
            System.out.println(creditMngr.calculate(1000));
        }
    }
}
