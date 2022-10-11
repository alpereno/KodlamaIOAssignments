package com.mycompany.javalessons.ThirdWeek.StaticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price=20000;
        product.name="GPU";
        manager.add(product);
    }
}
