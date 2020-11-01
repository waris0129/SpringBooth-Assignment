package com.cybertek.services.TX;

import com.cybertek.enums.Cities;
import com.cybertek.enums.RoomType;
import com.cybertek.utiliies.Area;
import com.cybertek.utiliies.Calculate;
import com.cybertek.utiliies.Templates;
import com.cybertek.utiliies.UnitPrice;
import org.springframework.stereotype.Component;


@Component
public class Taxes extends Templates {


    public Taxes(Area area, UnitPrice unitPrice, Calculate calculate) {
        super(area, unitPrice, calculate);
    }

    @Override
    public double calculateArea(RoomType roomType) {
        return super.calculateArea(roomType);
    }

    @Override
    public void getTotalPrice(Cities city, RoomType roomType) {
        super.getTotalPrice(city, roomType);
    }


}
