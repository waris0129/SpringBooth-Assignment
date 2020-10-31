package com.cybertek.services;

import com.cybertek.enums.AreaType;
import static com.cybertek.enums.AreaType.*;
import com.cybertek.enums.Cities;
import com.cybertek.enums.RoomType;
import com.cybertek.interfaces.GetAreaType;
import com.cybertek.interfaces.SelectCity;
import com.cybertek.interfaces.ValidateCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.NoSuchElementException;

@Component
public class UnitPrice implements SelectCity, ValidateCity { // Get Carpet Unit Pirce and AreaType

    @Autowired
    private Calculate unitPrice;


    @Override
    public double selectCity(Cities city) { // get unit price based on city, assign to Calculator class
        validateCity(city);

        double servicePrice = 0;

        switch (city){
            case DALLAS:
                servicePrice = 10;break;
            case SAN_ANTONIO:
                servicePrice = 20;break;
            case AUSTIN:
                servicePrice = 30;break;
        }

        return servicePrice;
    }


    @Override
    public boolean validateCity(Cities city) { // validate whether selected city is in service zones

        if(Arrays.stream(Cities.values()).anyMatch(p->p.equals(city))){
            return true;
        }

        throw new NoSuchElementException("Sorry, the service is not available in "+city+".");
    }






}
