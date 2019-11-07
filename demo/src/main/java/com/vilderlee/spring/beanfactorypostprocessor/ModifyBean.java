package com.vilderlee.spring.beanfactorypostprocessor;

import com.vilderlee.spring.condition.Test;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ModifyBean {

	private String desc;


	private void init(){
		System.out.println("ModifyBean Init Method invoke!");
	}

	public void modify(){
		System.out.println(desc);
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
