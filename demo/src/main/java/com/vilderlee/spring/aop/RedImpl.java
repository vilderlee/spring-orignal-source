package com.vilderlee.spring.aop;

import org.springframework.stereotype.Component;

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
@Component
public class RedImpl implements Color {

	@Override
	public void colorPrint() {
		System.out.println("This is Red");
	}
}
