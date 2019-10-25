package com.vilderlee.spring.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Conditional(value = OnSystemNameCondition.class)
public @interface ConditionOnSystemName {

	/**
	 * 系统属性名称
	 * @return 系统属性名称
	 */
	String name();

	/**
	 * 系统属性值
	 * @return 系统属性值
	 */
	String value();
}
