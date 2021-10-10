package com.uvsoftgroup.userregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UserRegistrationLiquibaseApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserRegistrationLiquibaseApplication.class, args);
	}

}
