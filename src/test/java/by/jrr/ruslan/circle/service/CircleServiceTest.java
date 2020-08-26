package by.jrr.ruslan.circle.service;

import by.jrr.ruslan.circle.bean.Circle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleServiceTest {


    @Test
    public void calculateArea() {
        Circle circle = new Circle(2.0);
        CircleService circleService = new CircleService();
        double expected = 12.56;
        double actual=circleService.calculateArea(circle);
          assertEquals(expected,actual, 0);
    }
    @Test
    public void calculateAreaZero() {
        Circle circle = new Circle(0.0);
        CircleService circleService = new CircleService();
        double expected = 0;
        double actual=circleService.calculateArea(circle);
        assertEquals(expected,actual, 0);
    }
}