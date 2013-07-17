package com.eclipsesource.virgo.examples.spring.aop.internal;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("echo")
public class Echo {

	public Object echo(final ProceedingJoinPoint pjp, String name) throws Throwable {
		final String result = (String) pjp.proceed();
		return result.toUpperCase() + ".." + result.toLowerCase() + "...."
		+ result.toLowerCase().substring(0, 5) + "......";
	}
	
	public void error(Exception exception, String name) {
		System.out.println("Shush!!");
	}
}
