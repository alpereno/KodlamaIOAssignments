package com.mycompany.javalessons.SecondWeek.Classes;

public class ProductManager {
    public void add(Product newProduct){
        System.out.println("product has been added = " + newProduct.getName());
        System.out.println(newProduct.getUniqueName());
    }
}
