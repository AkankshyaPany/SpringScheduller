package com.akankshya.Scheduller;

import java.util.Date;


import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component 
@Slf4j

public class Task {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(Task.class); 
	@Scheduled(initialDelay=1000,fixedRate=3000)
	public void task1() {
		
		log.info("task1 hiiiiiiiiii:", new Date());
	}

}
