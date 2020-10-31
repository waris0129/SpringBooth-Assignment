package com.cybertek.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dimension {

    @Value("${LENGTH}")
    static double length;

    @Value("${WIDTH}")
    static double width;

    @Value("${RADIUS}")
    static double radius;



}
