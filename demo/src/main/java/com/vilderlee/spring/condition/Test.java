package com.vilderlee.spring.condition;

import org.springframework.stereotype.Component;

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
@Component
@ConditionOnSystemName(name = "user.name", value = "dell")
public class Test {

	public void test(){
		System.out.println(Test.class.getName());
	}
}
