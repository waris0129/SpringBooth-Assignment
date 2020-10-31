package com.cybertek.services;

import com.cybertek.enums.AreaType;
import com.cybertek.enums.Cities;
import com.cybertek.enums.RoomType;
import com.cybertek.interfaces.CallServices;
import org.springframework.stereotype.Component;

@Component
public class Template implements CallServices{

        private Area area;
        private UnitPrice unitPrice;
        private Cities city;
        private RoomType roomType;
        private Calculate calculate;


        public Template(Cities city, RoomType roomType) {
                this.city = city;
                this.roomType = roomType;
                area = new Area();
                unitPrice = new UnitPrice();
                calculate = new Calculate();
        }



        public double calculateArea(){ // based on Area type get dimension and calculate area

                double calculateArea= 0;

                AreaType areaType = area.getAreaType(roomType);

                switch (areaType){
                        case CIRCLE:
                                calculateArea = calculate.getCircleArea();break;
                        case SQUARE:
                                calculateArea = calculate.getSquareArea();break;
                        case RECTANGLE:
                                calculateArea = calculate.getRectangleArea();break;

                }

                return calculateArea;
        }


        @Override
        public void CallService(Cities cities, RoomType roomType) {
                new Template( cities,  roomType);
        }

        @Override
        public double totalPrice() {
                return unitPrice.selectCity(city) * calculateArea();
        }
}
