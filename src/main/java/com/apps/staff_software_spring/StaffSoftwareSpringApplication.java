package com.apps.staff_software_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
@EntityScan("com.apps.staff_software_spring.persistence.entity")
public class StaffSoftwareSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaffSoftwareSpringApplication.class, args);
	}

}
