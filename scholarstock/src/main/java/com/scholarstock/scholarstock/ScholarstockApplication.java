package com.scholarstock.scholarstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.scholarstock.domains", "com.scholarstock.domains.enums"})
@ComponentScan(basePackages = "com.scholarstock")
@EnableJpaRepositories(basePackages = "com.scholarstock.repositories")
@SpringBootApplication
public class ScholarstockApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScholarstockApplication.class, args);
	}

}
