package com.mycompany.javalessons.SecondWeek.Classes;

public class Main {
    public static void main(String[] args) {
        
        Product product = new Product(1, "Laptop", "Lenovo", 16000, 10, "black");
//        Product product = new Product();
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("Lenovo");
//        product.setPrice(16000);
//        product.setStockAmount(10);
//        product.setColor("black");
        
        System.out.println("product name = " + product.getName());
        
        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
