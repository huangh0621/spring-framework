package com.hh.app;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NotVeryUsefulAspect {

	@Pointcut("execution(* com.hh.dao..*.*(..))")
	private void anyOldTransfer() {

	}

	@Pointcut("execution(* com.hh.dao.UserDao.show(..))&&args(str,..)")
	private void anyOldTransfer2(String str) {

	}

	@Pointcut("execution(* com.hh.dao.UserDao.returnString(..))&&args(str1,..)")
	private void anyOldTransfer3(String str1) {

	}

	@Before("anyOldTransfer()")
	public void advice() {
		System.out.println("-----------------");
	}

	@After("anyOldTransfer()")
	public void advice2() {
		System.out.println("=================");
	}

	@Before("anyOldTransfer2(str)")
	public void advice3(String str) throws Exception {
		System.out.println("+" + str + "+");
		if ("1234".equals(str)) {
			throw new Exception("sdfwefwfw");
		}

	}

	@AfterThrowing("anyOldTransfer2(str)")
	public void advice4(String str) {
		System.out.println("new Exception");
	}

	@AfterReturning(pointcut = "execution(* com.hh.dao.UserDao.*(..))&&args(str1)", returning = "retVal")
	public void advice5(String str1, Object retVal) {
		System.out.println("input:" + str1);
		System.out.println("output:" + (String) retVal);
	}

}
