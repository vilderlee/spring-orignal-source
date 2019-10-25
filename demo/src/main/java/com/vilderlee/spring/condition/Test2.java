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
@ConditionOnSystemName(name = "os.name", value = "dell")
@Component
public class Test2 {

	public void test(){
		System.out.println(Test2.class.getName());
	}
}
