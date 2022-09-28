package com.mycompany.javalessons.SecondWeek.Classes;

public class Product {
    private int id;
    private String name;
    private String description;
    private float price;
    private int stockAmount;
    private String color;    

    public Product(){
    }
    
    public Product(int id, String name, String description, float price, int stockAmount, String color) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.color = color;
    }

    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public String getColor() {
        return color;
    }
    
    public String getUniqueName(){
        return this.name.substring(0,2)+this.id;
    }
    
    
}
