package com.vilderlee.spring.dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * 类说明:
 * DependsOn属性测试demo
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/11/7      Create this file
 * </pre>
 */
@ComponentScan
public class DependsOnMain {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(DependsOnMain.class);
		context.start();
		System.out.println("start !!!");
	}

}
