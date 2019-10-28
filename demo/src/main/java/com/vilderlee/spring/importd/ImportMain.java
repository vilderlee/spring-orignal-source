package com.vilderlee.spring.importd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.stream.Stream;

/**
 * 类说明:
 *
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/10/28      Create this file
 * </pre>
 */
@ColorImport(color = "blue")
public class ImportMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ImportMain.class);

		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
