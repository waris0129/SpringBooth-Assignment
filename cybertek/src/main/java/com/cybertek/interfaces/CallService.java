package com.cybertek.interfaces;

import com.cybertek.enums.Cities;
import com.cybertek.enums.RoomType;

public interface CallService {

    void getTotalPrice(Cities city, RoomType roomType);

}
