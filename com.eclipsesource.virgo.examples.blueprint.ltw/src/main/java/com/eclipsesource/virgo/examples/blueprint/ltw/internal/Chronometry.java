package com.eclipsesource.virgo.examples.blueprint.ltw.internal;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Chronometry {

	@Around("factorialCalculation(n)")
	public Integer trace(ProceedingJoinPoint thisJoinPoint, int n) throws Throwable {
		long start = System.nanoTime();
		Object result = thisJoinPoint.proceed(new Object[] {Integer.valueOf(n)});
		long duration = System.nanoTime() - start;

		System.out.println("Calculated factorial of " + n + " in " + (duration / 1000) + " micro seconds.");
		return (Integer) result;
	}

	@Pointcut("execution(* * ..Calculator+.factorial(..)) && args(n)")
	public void factorialCalculation(int n) {
	}

}
