package com.subra.springschedule;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleConfig {

	Logger log = LoggerFactory.getLogger(ScheduleConfig.class);
		
	@Scheduled(fixedRate=5000)
	void fixedrateScheduling(){
		//System.out.println("fixedrateScheduling...." LocalDateTime.now());
		log.info("<<<<<<<<<<<<<<fixedrateScheduling.... {}", LocalDateTime.now() );
	}
	
	@Scheduled(fixedDelay=5000)
	void fixedDelay() throws InterruptedException{
		Thread.sleep(10000); //10 second
		log.info("!!!!!!!!!!fixedDelay.... {}", LocalDateTime.now() );
	}
}
