package com.mycompany.javalessons.ThirdWeek.OOPStream;

public class Main {
    public static void main(String[] args) {
//        Customer ivory = new Person();
//        
//        Person ivoryPerson = (Person)ivory;
//        
//        ivoryPerson.firstName="asd";
//        ivory.show();
//        
//        ivoryPerson.open();
//        ivoryPerson.show();

        Customer customer = new Customer();
        customer.id = 1;
        customer.city= "New York";
        
        CustomerManager customerManager = new CustomerManager(customer, new MilitaryCreditManager());
        customerManager.save();
        customerManager.giveCredit();
        
        Company company= new Company();
        company.companyName = "Table";
        company.id=100;
        company.taxNumber="0513";
        
        Person person = new Person();
        person.firstName = "John";
        person.lastName = "Wick";
        
    }
}
