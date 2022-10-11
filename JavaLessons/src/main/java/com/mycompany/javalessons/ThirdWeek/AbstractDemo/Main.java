package com.mycompany.javalessons.ThirdWeek.AbstractDemo;

public class Main {
    // bir musterinin veri tabanina kaydedilmesini isliyoruz
    // veri tabanina kaydederken farkli veri tabanlari olabilir. mysql oracle mssql vs
    // oyle bir sistem yapilmali ki farkli  musterilerin kullandiklari veri tabanina uygun sistemler yapilmali
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDataBaseManager = new MySqlDataBaseManager();
        customerManager.getCustomers();
    }
}
