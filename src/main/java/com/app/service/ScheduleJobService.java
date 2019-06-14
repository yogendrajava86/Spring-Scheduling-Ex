package com.app.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleJobService {

	// Setup Schedule Job in every 2 second interval
	@Scheduled(fixedDelay=1000*2)
	public void exTaskShedule() {
		System.out.println("Task Executed at "+new Date());
	}
	// Setup Schedule Job in every 2 second interval 
		@Scheduled(fixedRate=1000*5)
		public void exTaskShedule1() {
			System.out.println("Fixed Rate Task Executed at "+new Date());
		}
	
	// Setup Schedule Job in every day 10:10:00 PM(Point of Time) 
		@Scheduled(cron="0 10 22 * * *")
		public void exTaskShedule2() {
			System.out.println("Fixed Time Task Executed at "+new Date());
		}
}
