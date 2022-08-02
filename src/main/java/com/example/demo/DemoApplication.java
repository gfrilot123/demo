// This is the first class created but step 3 for deploying to db via CommandLineRunner
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
import com.example.demo.domain.Owner;
import com.example.demo.domain.OwnerRepository;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private CarRepository repository;

	@Autowired
	private OwnerRepository orepository;

	private static final Logger logger =
	LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		logger.info("Hello Spring Boot");
	}

	@Bean

	CommandLineRunner runner () {
		return args -> {
			// Owner owner1 = new Owner("Gerald", "Frilot");
			// Owner owner2 = new Owner("Katie", "Frilot");
			// orepository.save(owner1);
			// orepository.save(owner2);
			// Car car = new Car("Ford", "Mustang", "Red", "ADF-1121",
			// 2017, 59000, owner1);
			// repository.save(car);
			// car = new Car("Nissan", "Leaf", "White", "ssj-3002",
			// 2014, 29000, owner2);
			// repository.save(car);
			// car = new Car("Toyota", "Prius", "Silver", "KKO-0212",
			// 2018, 39000, owner2);
			// repository.save(car);
		};
	}

}
