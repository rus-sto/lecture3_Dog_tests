package by.jrr.ruslan.product;

import by.jrr.ruslan.product.bean.Product;
import by.jrr.ruslan.product.service.ProductService;

public class App {
    public static void main(String[] args) {
//        entry point to be implemented
        Product product=new Product("Milk", 10,20);
        ProductService productService= new ProductService();
        productService.actualPrice(product);
    }
}
