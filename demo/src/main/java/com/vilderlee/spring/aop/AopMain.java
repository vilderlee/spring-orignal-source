package com.vilderlee.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Map;

/**
 * 类说明:
 *
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/11/11      Create this file
 * </pre>
 */
@ComponentScan("com.vilderlee.spring.aop")
@EnableAspectJAutoProxy
public class AopMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AopMain.class);
		Map<String, Color> beansOfType = context.getBeansOfType(Color.class);
		beansOfType.forEach((name,color)-> color.colorPrint());

	}
}
