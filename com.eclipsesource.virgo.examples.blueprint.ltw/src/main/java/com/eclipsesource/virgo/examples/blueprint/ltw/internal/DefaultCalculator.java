package com.eclipsesource.virgo.examples.blueprint.ltw.internal;

import org.springframework.stereotype.Service;

import com.eclipsesource.virgo.examples.blueprint.ltw.Calculator;

@Service("calculator")
public class DefaultCalculator implements Calculator {

	@Override
	public int factorial(int n) {
		return calculatFactorial(n);
	}

	private int calculatFactorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * calculatFactorial(n - 1);
		}
	}

}
