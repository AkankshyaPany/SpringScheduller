package com.akankshya.Cronjobscheduller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CronjobschedullerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronjobschedullerApplication.class, args);
	}

}
