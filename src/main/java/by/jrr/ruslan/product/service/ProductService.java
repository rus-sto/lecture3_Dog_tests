package by.jrr.ruslan.product.service;

import by.jrr.ruslan.product.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductService {
    private Product product;
    private Logger logger = LoggerFactory.getLogger(ProductService.class);


    public double actualPrice(Product product){
        logger.info("For product - {}, with actual price = {} EUR,", product.getName(),+product.getRegularPrice());
        logger.info(" and discount = {} %, actual price is EUR= ",product.getDiscount());

              return product.getRegularPrice()*(1-product.getDiscount()/100);

    }

  }
