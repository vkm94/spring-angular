package com.example.BabaFoodPayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.repo")
@EntityScan("com")
@ComponentScan("com")
@EnableEurekaClient

public class BabaFoodPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabaFoodPaymentApplication.class, args);
	}

}
