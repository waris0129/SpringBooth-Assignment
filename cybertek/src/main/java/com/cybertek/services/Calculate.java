package com.cybertek.services;

import com.cybertek.interfaces.FloorArea;
import com.cybertek.interfaces.TotalPrice;
import org.springframework.stereotype.Component;

@Component
public class Calculate implements FloorArea {


    @Override
    public double getCircleArea() {
        return Dimension.radius * Dimension.radius * Math. PI;
    }

    @Override
    public double getRectangleArea() {
        return Dimension.length * Dimension.width;
    }

    @Override
    public double getSquareArea() {
        return Dimension.length * Dimension.length;
    }

}
