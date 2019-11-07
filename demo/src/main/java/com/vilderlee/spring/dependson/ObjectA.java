package com.vilderlee.spring.dependson;

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
@Component("obejectA")
public class ObjectA {

	public ObjectA() {
		System.out.println("This is ObjectA");
	}
}
