package com.mukscode.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPExpressions {

	@Pointcut("execution(* com.mukscode.aop.dao.*.*(..))")
	public void forDaoPackage() {
		
	}
	
	//create point cut for getter method
	@Pointcut("execution(* com.mukscode.aop.dao.*.get*(..))")
	public void getter() {}
	
	//create point cut for setter method
	@Pointcut("execution(* com.mukscode.aop.dao.*.set*(..))")
	public void setter() {}
	
	//create point cut: include package/ exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoSetterGetter() {}
	
}
