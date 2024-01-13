package org.example.correct;

public class ProductCalculateTax {

    public Float calculateTax(Product product){

        return  product.getPrice() * product.getTaxRatio();
    }
}
