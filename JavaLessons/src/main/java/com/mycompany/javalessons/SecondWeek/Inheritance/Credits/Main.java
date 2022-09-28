package com.mycompany.javalessons.SecondWeek.Inheritance.Credits;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
                
        creditUI.showCredit(new BaseCreditManager());
        creditUI.showCredit(new TeacherCreditManager());
        creditUI.showCredit(new AgricultureCreditManager());
    }
}
