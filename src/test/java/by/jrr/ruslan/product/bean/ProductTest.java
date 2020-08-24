package by.jrr.ruslan.product.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void getName() {
        Product product=new Product();
        product.setName("Milk");
        product.setRegularPrice(10.0);
        product.setDiscount(20);
        String expected = "Milk";
        String actual = product.getName();
        assertEquals(expected,actual);
    }

    @Test
    public void getRegularPrice() {
        Product product=new Product();
        product.setName("Milk");
        product.setRegularPrice(10.0);
        product.setDiscount(20);
        double expected = 10.0;
        double actual = product.getRegularPrice();
        assertEquals(expected,actual, 0);
    }

    @Test
    public void getDiscount() {
        Product product=new Product();
        product.setName("Milk");
        product.setRegularPrice(10.0);
        product.setDiscount(20);
        double expected = 20;
        double actual = product.getDiscount();
        assertEquals(expected,actual,0);
    }

    @Test
    public void testEqualsFalse() {
        Product product1=new Product();
        product1.setName("Milk");
        product1.setRegularPrice(20.0);
        product1.setDiscount(20);
        Product product2=new Product();
        product2.setName("Milk");
        product2.setRegularPrice(10.0);
        product2.setDiscount(50);
        boolean expected =false;
        boolean actual = product1.equals(product2);
        assertEquals(expected,actual);
    }
    @Test
    public void testEqualsTrue() {
        Product product1=new Product();
        product1.setName("Milk");
        product1.setRegularPrice(10.0);
        product1.setDiscount(20);
        Product product2=new Product();
        product2.setName("Milk");
        product2.setRegularPrice(10.0);
        product2.setDiscount(20);
        boolean expected =true;
        boolean actual = product1.equals(product2);
        assertEquals(expected,actual);
    }

    @Test
    public void testHashCode() {
        Product product=new Product();
        product.setName("Milk");
        product.setRegularPrice(10.0);
        product.setDiscount(20);
        int expected = -1913656870;
        int actual =product.hashCode();
        assertEquals(expected,actual);
    }

    @Test
    public void testToString() {
        Product product=new Product();
        product.setName("Milk");
        product.setRegularPrice(10.0);
        product.setDiscount(20);
        String expected = "Product{name='Milk', regularPrice=10.0, discount=20.0}";
        String actual = product.toString();
        assertEquals(expected,actual);
    }
}