package com.wisely.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	private static final SimpleDateFormat dateFormat = new 
			SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)//1 每隔固定时间执行
	public void reportCurrentTime() {
		System.out.println("每隔五秒执行一次 " + dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "0 29 15 ? * *" )//2 指定时间执行，本例指的是每天15点29分执行
	public void fixTimeExecution() {
		System.out.println("在指定时间 " + dateFormat.format(new Date()) + "执行");
	}
}
