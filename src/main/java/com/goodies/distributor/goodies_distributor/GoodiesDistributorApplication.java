package com.goodies.distributor.goodies_distributor;

import com.goodies.distributor.goodies_distributor.entity.EventDetails;
import com.goodies.distributor.goodies_distributor.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication(
		exclude = {
				org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
		}
)
public class GoodiesDistributorApplication  {

	@Autowired
	private EventRepository eventRepository;

	public static void main(String[] args) {
		SpringApplication.run(GoodiesDistributorApplication.class, args);
	}

}