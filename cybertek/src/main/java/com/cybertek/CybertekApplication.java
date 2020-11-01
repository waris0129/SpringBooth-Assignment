package com.cybertek;

import com.cybertek.enums.Cities;
import com.cybertek.enums.RoomType;
import com.cybertek.interfaces.CallService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CybertekApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(CybertekApplication.class, args);

		CallService service = context.getBean("customer", CallService.class);

		service.getTotalPrice(Cities.AUSTIN,RoomType.BED_ROOM);

	}

}
