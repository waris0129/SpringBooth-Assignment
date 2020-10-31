package com.example.demo.Class;

import com.example.demo.Enum.Cities;
import com.example.demo.Interfaces.FindCity;
import org.springframework.stereotype.Component;

@Component
public class Houston {
    private FindCity findCity;

    public Houston(FindCity findCity) {
        this.findCity = findCity;
    }


    public void setCity(Cities cities){
        new template(cities);
    }

    public void callCity(){
        findCity.findCity();
    }



}
