package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev"); //1 先将活动的Profile设置为prod
		context.register(ProfileConfig.class); //2 后置Bean配置类，不然会报Bean未定义错误
		context.refresh(); //3
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		
		System.out.println(demoBean.getContent());
		
		context.close();
	}

}
