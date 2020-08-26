package by.jrr.ruslan.circle.service;

import by.jrr.ruslan.circle.bean.Circle;

public class CircleService {


    public  double calculateArea(Circle circle) {
        return circle.getRadius()*circle.getRadius()*3.14;
    }


}
