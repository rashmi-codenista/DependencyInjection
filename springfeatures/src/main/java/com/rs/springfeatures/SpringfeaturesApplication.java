package com.rs.springfeatures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringfeaturesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringfeaturesApplication.class, args);

		// Retrieve the Controller bean from the Spring context
		Controller c = context.getBean(Controller.class);
		c.Con();
		Laptop l=context.getBean(Laptop.class);
		l.get();
	}
}
