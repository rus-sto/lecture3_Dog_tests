package by.jrr.ruslan.circle.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getRadius() {
        Circle circle=new Circle();
        circle.setRadius(2.0);
        double expected =2.0;
        double actuale = circle.getRadius();
        assertEquals(expected, actuale,0);
    }

    @Test
    public void testEqualsTrue() {
        Circle circle1=new Circle();
        circle1.setRadius(2.0);
        Circle circle2=new Circle();
        circle2.setRadius(2.0);
        boolean expected = true;
        boolean actuale = circle1.equals(circle2);
        assertEquals(expected, actuale);
    }

    @Test
    public void testEqualsFalse() {
        Circle circle1=new Circle();
        circle1.setRadius(2.0);
        Circle circle2=new Circle();
        circle2.setRadius(2.1);
        boolean expected = false;
        boolean actuale = circle1.equals(circle2);
        assertEquals(expected, actuale);
    }

    @Test
    public void testHashCode() {
        Circle circle=new Circle();
        circle.setRadius(2.0);
        int expected = 1073741855;
        int actuale =circle.hashCode();
        assertEquals(expected, actuale);
    }

    @Test
    public void testToString() {
        Circle circle=new Circle();
        circle.setRadius(2.0);
        String expected ="Circle{radius=2.0}" ;
        String actuale =circle.toString();
        assertEquals(expected, actuale);
    }
}