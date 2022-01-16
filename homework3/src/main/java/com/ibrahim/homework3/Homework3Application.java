package com.ibrahim.homework3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableJpaRepositories
public class Homework3Application {

	public static void main(String[] args) {
		SpringApplication.run(Homework3Application.class, args);
	}

}
