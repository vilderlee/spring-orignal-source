package com.vilderlee.spring.dependson;

import org.springframework.context.annotation.DependsOn;
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
@DependsOn({"obejectA"})
public class DependsOnObject {

	public DependsOnObject() {
		System.out.println("This is DependsOnObject, its dependsOn ObjectA");
	}
}
