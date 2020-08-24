package by.jrr.ruslan.product.service;

import by.jrr.ruslan.product.bean.Product;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {

    @Test
    public void actualPrice() {
        Product product=new Product("Milk", 10,20);
        ProductService productService = new ProductService();
        double expected = 8.0;
        double actual= productService.actualPrice(product);
        assertEquals(expected,actual);
    }



}