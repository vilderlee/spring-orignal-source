package com.vilderlee.spring.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

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
public class OnSystemNameCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

		Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionOnSystemName.class.getName());

		String name = String.valueOf(attributes.get("name"));
		String value = String.valueOf(attributes.get("value"));

		return value.equals(System.getProperty(name));
	}
}
