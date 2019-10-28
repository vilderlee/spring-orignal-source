package com.vilderlee.spring.importd;

import org.springframework.context.annotation.ImportSelector;
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
public class ColorImportSelector implements ImportSelector {

	//返回需要加载的类路径-->会将其作为一个Bean注入到Spring容器中
	@Override public String[] selectImports(AnnotationMetadata importingClassMetadata) {

		Map<String, Object> attributes = importingClassMetadata.getAnnotationAttributes(ColorImport.class.getName());
		String value = (String) attributes.get("color");
		if ("blue".equals(value)) {
			return new String[] { Blue.class.getName() };
		} else if ("red".equals(value)) {
			return new String[] { Red.class.getName() };
		} else {
			return new String[0];
		}
	}
}
