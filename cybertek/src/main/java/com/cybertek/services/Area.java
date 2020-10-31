package com.cybertek.services;

import com.cybertek.enums.AreaType;
import com.cybertek.enums.RoomType;
import com.cybertek.interfaces.FloorArea;
import com.cybertek.interfaces.GetAreaType;
import org.springframework.stereotype.Component;

import static com.cybertek.enums.AreaType.*;

@Component
public class Area implements GetAreaType {

    @Override
    public AreaType getAreaType(RoomType roomType) {// determine what type of area applied for area calculation, also define Option class

        AreaType areaType = null;

        switch (roomType){
            case KITCHEN:
                areaType = CIRCLE;break;
            case BED_ROOM:
                areaType = SQUARE;break;
            case LIVING_ROOM:
                areaType = RECTANGLE;
        }

        return areaType;
    }


}
