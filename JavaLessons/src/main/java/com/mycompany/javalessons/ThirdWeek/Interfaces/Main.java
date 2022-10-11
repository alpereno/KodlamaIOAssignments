package com.mycompany.javalessons.ThirdWeek.Interfaces;

public class Main {
    public static void main(String[] args) {
        // veri erişim (data access) katmanı    
        // iş katmanları managerler falan var mı (işlerin kontrol edildiği yer yani not geçerli mi değil mi falan) (customer manager)
        // arayüz kodları (java fx, swing, html, android uygulamalrı)
        // bu katmanlar arası geçişleri interfacelerle yapılır
        
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
