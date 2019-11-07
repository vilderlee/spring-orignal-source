package com.vilderlee.spring.beanfactorypostprocessor;

import com.vilderlee.spring.condition.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

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
@Component
public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("DemoBeanFactoryPostProcessor#postProcessBeanFactory invoke !!!");
		System.out.println("在这里对BeanFactory进行二次修饰");

		BeanDefinition modifyBean = beanFactory.getBeanDefinition("modifyBean");
		modifyBean.getPropertyValues().addPropertyValue("desc", "Lichao");
		modifyBean.setInitMethodName("init");
	}
}
