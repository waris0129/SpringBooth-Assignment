package com.cybertek.services.VA;

import com.cybertek.enums.Cities;
import com.cybertek.enums.RoomType;
import com.cybertek.utiliies.Area;
import com.cybertek.utiliies.Calculate;
import com.cybertek.utiliies.Customer;
import com.cybertek.utiliies.UnitPrice;
import org.springframework.stereotype.Component;

@Component
public class Virginia extends Customer {
    public Virginia(Area area, UnitPrice unitPrice, Calculate calculate) {
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
