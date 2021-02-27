package com.mukscode.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class MyAPIAnalyticsAspect {

	@Before("com.mukscode.aop.aspect.AOPExpressions.forDaoPackageNoSetterGetter()")
	public void performAPIAnalytics() {
		System.out.println("\n=======> Performing API Analytics");
	}
}
