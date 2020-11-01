package com.cybertek.services;

import com.cybertek.interfaces.FloorArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculate implements FloorArea {

    @Value("${LENGTH}")
    double length;
    @Value("${WIDTH}")
    double width;
    @Value("${RADIUS}")
    double radius;

    @Override
    public double getCircleArea() {
        return radius * radius * Math. PI;
    }

    @Override
    public double getRectangleArea() {
        return length * width;
    }

    @Override
    public double getSquareArea() {
        return length * length;
    }

}
