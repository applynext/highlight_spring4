package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	
	 /*通过注解表明该方法是个异步方法，如果注解在类级别表明该类所有的方法都是异步方法。
	   这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor*/
	@Async //1
	public void executeAsyncTask(Integer i) {
		System.out.println("执行异步任务+1：" + (i + 1));
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i) {
		System.out.println("执行异步任务+1：" + (i + 1));
	}
}
