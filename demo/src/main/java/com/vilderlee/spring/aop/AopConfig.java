package com.vilderlee.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
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
@Aspect
@Component
public class AopConfig {

	/**
	 * execution(<修饰符模式>? <返回类型模式> <方法名模式>(<参数模式>) <异常模式>?)
	 *
	 *
	 * 例如定义切入点表达式  execution (* com.sample.service.impl..*.*(..))
	 *
	 * execution()是最常用的切点函数，其语法如下所示：
	 *
	 *  整个表达式可以分为五个部分：
	 *
	 *  1、execution(): 表达式主体。
	 *
	 *  2、第一个*号：表示返回类型，*号表示所有的类型。
	 *
	 *  3、包名：表示需要拦截的包名，后面的两个句点表示当前包和当前包的所有子包，com.sample.service.impl包、子孙包下所有类的方法。
	 *
	 *  4、第二个*号：表示类名，*号表示所有的类。
	 *
	 *  5、*(..):最后这个星号表示方法名，*号表示所有的方法，后面括弧里面表示方法的参数，两个句点表示任何参数。
	 *
	 *
	 */
	@Pointcut(value = "execution(* com.vilderlee.spring.aop..*Impl.*(..))")
	public void pointCut(){}

	@Around(value = "pointCut()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.printf("AopConfig Interceptor Method: %s, before invoke this method %s \r\n",
				joinPoint.getSignature().getName(), joinPoint.getSignature().getName());
		joinPoint.proceed();
		System.out.printf("AopConfig Interceptor Method: %s, after invoke this method %s \r\n",
				joinPoint.getSignature().getName(), joinPoint.getSignature().getName());
	}

	public void hello(){
		System.out.println("123123123123123");
	}
}
