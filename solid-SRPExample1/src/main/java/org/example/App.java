package org.example;

import org.example.correct.Product;
import org.example.correct.ProductCalculateTax;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//wrong Example
        /*Product apple = new Product(
                1,
                "redApple",
                5000,
                .09f
        );
        Float totalPrice = (float) 5*apple.getPrice();
        totalPrice += totalPrice*5;
        //System.out.println(apple.calculateTax());
        System.out.println(totalPrice);
   */
//correct Example
        ProductCalculateTax calculateTax = new ProductCalculateTax();
        Product product = new Product(

                1,
                "redApple",
                5000,
                .09f
        );
        Integer kg = 5;
        Float totalPrice = (float)product.getPrice() * kg;
        totalPrice += calculateTax.calculateTax(product)*kg;
        System.out.println(totalPrice);



}
}
