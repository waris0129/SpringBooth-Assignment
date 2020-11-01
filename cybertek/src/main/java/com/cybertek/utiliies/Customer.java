package com.cybertek.utiliies;

import com.cybertek.enums.AreaType;
import com.cybertek.enums.Cities;
import com.cybertek.enums.RoomType;
import com.cybertek.interfaces.CallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer implements CallService {

        private Area area;
        private UnitPrice unitPrice;
        private Calculate calculate;

        @Autowired
        public Customer(Area area, UnitPrice unitPrice, Calculate calculate) {
                this.area = area;
                this.unitPrice = unitPrice;
                this.calculate = calculate;
        }


        public double calculateArea(RoomType roomType){ // based on Area type get dimension and calculate area

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
        public void getTotalPrice(Cities city, RoomType roomType){

                double totalPrice = unitPrice.selectCity(city) * calculateArea(roomType);

                System.out.println(String.format("%.2f",totalPrice));
        }

}
