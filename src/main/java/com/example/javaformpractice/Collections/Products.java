package com.example.javaformpractice.Collections;

public class Products {
    private String productName;
    private Double price;

    public Products(){

    }
    public Products(String productName, Double price){
        this.productName = productName;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }
    @Override
    public String toString(){
        return this.productName + " "+ this.price;
    }
}
