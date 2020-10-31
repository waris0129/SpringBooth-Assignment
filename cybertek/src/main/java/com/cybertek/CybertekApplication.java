package com.cybertek;

import com.cybertek.enums.Cities;
import com.cybertek.enums.RoomType;
import com.cybertek.interfaces.CallServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CybertekApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(CybertekApplication.class, args);

		CallServices services = context.getBean("clients",CallServices.class);

		services.CallService(Cities.DALLAS, RoomType.BED_ROOM);

		double price = services.totalPrice();

		System.out.println(price);

	}

}
