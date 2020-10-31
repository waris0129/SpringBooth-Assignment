package com.cybertek.services;

import com.cybertek.enums.Cities;
import com.cybertek.enums.RoomType;
import com.cybertek.interfaces.CallServices;

public class Clients{

    private CallServices callServices;

    public Clients(CallServices callServices) {
        this.callServices = callServices;
    }

    public void callServices(Cities city, RoomType roomType){
        callServices.CallService(city,roomType);
    }

    public void totalPrice(){
        callServices.totalPrice();
    }
}
