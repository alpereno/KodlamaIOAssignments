package com.mycompany.javalessons.ThirdWeek.StaticDemo;

public class ProductValidator {
    public static boolean isValid(Product product){
        if (product.price > 0 && !(product.name.isEmpty())) {
            return true;
        }
        return false;
    }
}
