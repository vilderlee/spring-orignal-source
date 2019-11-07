package com.vilderlee.spring.beanfactorypostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

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
@ComponentScan("com.vilderlee.spring.beanfactorypostprocessor")
public class BeanFactoryPostProcessorMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorMain.class);

		ModifyBean bean = context.getBean(ModifyBean.class);
		bean.modify();
	}
}
