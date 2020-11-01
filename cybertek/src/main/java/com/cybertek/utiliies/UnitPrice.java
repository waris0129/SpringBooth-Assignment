package com.cybertek.utiliies;

import com.cybertek.enums.Cities;
import com.cybertek.interfaces.SelectCity;
import org.springframework.stereotype.Component;

@Component
public class UnitPrice implements SelectCity { // Get Carpet Unit Pirce and AreaType

    @Override
    public double selectCity(Cities city) { // get unit price based on city, assign to Calculator class

        double servicePrice = 0;

        switch (city){
            case DALLAS:
                servicePrice = 4.67;break;
            case SAN_ANTONIO:
                servicePrice =4.56;break;
            case AUSTIN:
                servicePrice = 4.32;break;
            case FAIRFAX:
                servicePrice = 5.98;break;
            case ARLINGTON:
                servicePrice =5.32;break;
            case MCLEAN:
                servicePrice = 5.44;break;
            default:
                try{
                    throw new Exception();
                }catch (Exception e){
                    System.out.println("City Not Found");
                }


        }

        return servicePrice;
    }

}
