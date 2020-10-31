package com.cybertek.interfaces;

import com.cybertek.enums.Cities;
import com.cybertek.enums.RoomType;

public interface TotalPrice {

    void CallService(Cities cities, RoomType roomType);

    double totalPrice();

}
