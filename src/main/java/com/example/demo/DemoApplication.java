// First class created but step 3 for deploying to db via CommandLineRunner
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.domain.Car;
import com.example.demo.domain.CarRepository;

@SpringBootApplication
public class DemoApplication {
	@Autowired
	private CarRepository repository;
	private static final Logger logger =
	LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		logger.info("Hello Spring Boot");
	}

	@Bean

	CommandLineRunner runner () {
		return args -> {
			repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121",
			2017, 59000));
			repository.save(new Car("Nissan", "Leaf", "White", "ssj-3002",
			2014, 29000));
			repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212",
			2018, 39000));
		};
	}

}
