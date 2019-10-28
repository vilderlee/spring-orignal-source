package com.vilderlee.spring.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * 类说明:
 *
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/10/25      Create this file
 * </pre>
 */
@ComponentScan("com.vilderlee.spring.condition")
public class Main {

	@Bean
	public String beanTest(){
		return "123";
	}

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		Test test = context.getBean(Test.class);
		test.test();
		context.start();

		int x = 3;
		do{
			x--;
		}while (x >0);
	}
}
