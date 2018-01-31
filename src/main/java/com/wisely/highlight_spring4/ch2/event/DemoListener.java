package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> { //1指定监听的事件类型

	@Override
	public void onApplicationEvent(DemoEvent event) { //2 
		String msg = event.getMsg();
		
		System.out.println("我（bean-demoListener）接收到了bean-demoPublisher发布的消息：" + msg);
	}
	
	
}
