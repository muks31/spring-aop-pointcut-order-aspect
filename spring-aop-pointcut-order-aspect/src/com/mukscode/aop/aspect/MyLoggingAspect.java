package com.mukscode.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyLoggingAspect {
	
	@Before("com.mukscode.aop.aspect.AOPExpressions.forDaoPackageNoSetterGetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======> Executing @Before advice on method");
	}
}
