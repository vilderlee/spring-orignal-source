package com.vilderlee.spring.importd;

import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

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
public class ColorImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
			BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
		Map<String, Object> attributes = importingClassMetadata.getAnnotationAttributes(ColorImport.class.getName());
		String value = (String) attributes.get("color");
		if ("blue".equals(value)) {
			BeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(Blue.class);
			String beanName = importBeanNameGenerator.generateBeanName(beanDefinition,registry);

			registry.registerBeanDefinition(beanName , beanDefinition);
		} else if ("red".equals(value)) {
			BeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(Red.class);
			String beanName = importBeanNameGenerator.generateBeanName(beanDefinition,registry);
			registry.registerBeanDefinition(beanName , beanDefinition);
		}
	}
}
