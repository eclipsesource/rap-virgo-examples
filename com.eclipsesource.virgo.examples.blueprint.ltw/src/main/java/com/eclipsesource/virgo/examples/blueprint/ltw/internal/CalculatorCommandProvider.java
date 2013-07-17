package com.eclipsesource.virgo.examples.blueprint.ltw.internal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eclipsesource.virgo.examples.blueprint.ltw.Calculator;

@Service("calculatorCommandProvider")
public class CalculatorCommandProvider {

	@Autowired
	private Calculator calculator;

	public void factorial(int n) {
		System.out.println("Factorial of " + n + " is " + calculator.factorial(n));
	}

	public String getHelp() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("---factorial commands---\n");
		buffer.append("\factorial {number} - calculate factorial of given number\n");
		return buffer.toString();
	}

}
