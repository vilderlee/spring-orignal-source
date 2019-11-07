package com.vilderlee.spring.beanpostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * 类说明:
 *
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/11/7      Create this file
 * </pre>
 */
@EnableAspectJAutoProxy
public class BeanPostProcessorMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeanPostProcessorMain.class);


	}
}
