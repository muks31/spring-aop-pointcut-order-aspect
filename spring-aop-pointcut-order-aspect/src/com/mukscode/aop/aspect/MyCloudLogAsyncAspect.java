package com.mukscode.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class MyCloudLogAsyncAspect {

	@Before("com.mukscode.aop.aspect.AOPExpressions.forDaoPackageNoSetterGetter()")
	public void LoggingToCloud() {
		System.out.println("\n=======> Logging to Cloud");
	}
}
