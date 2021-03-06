//package com.wisely.highlight_spring4.ch3.mylearn;
//
//import org.springframework.context.annotation.AdviceMode;
//import org.springframework.context.annotation.AdviceModeImportSelector;
//import org.springframework.scheduling.annotation.ProxyAsyncConfiguration;
//
//public class AsyncConfigurationSelector extends AdviceModeImportSelector<EnableAsync> {
//	private static final String ASYNC_EXECUTION_ASPECT_CONFIGURATION_CLASS_NAME 
//		= "org.springframework.scheduling.aspectj.AspectJAsycConfiguration";
//	
//	@Override
//	protected String[] selectImports(AdviceMode adviceMode) {
//		switch (adviceMode) {
//		case PROXY:
//			return new String[] {ProxyAsyncConfiguration.class.getName()};
//		case ASPECTJ:
//			return new String[] {ASYNC_EXECUTION_ASPECT_CONFIGURATION_CLASS_NAME};
//		}
//		return null;
//	}
//	
//}
