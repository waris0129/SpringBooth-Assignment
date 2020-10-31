package com.example.demo.Class;

import com.example.demo.Enum.Cities;
import com.example.demo.Interfaces.FindCity;
import org.springframework.stereotype.Component;

@Component
public class template implements FindCity {

    private Cities cities;

    public template(Cities cities) {
        this.cities = cities;
    }

    @Override
    public void findCity() {
        System.out.println(cities);
    }
}
