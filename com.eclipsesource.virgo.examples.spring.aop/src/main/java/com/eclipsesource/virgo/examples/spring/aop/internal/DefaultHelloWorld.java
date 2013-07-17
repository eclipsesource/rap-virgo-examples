package com.eclipsesource.virgo.examples.spring.aop.internal;

import org.springframework.stereotype.Component;

import com.eclipsesource.virgo.examples.spring.aop.HelloWorld;

@Component("helloWorld")
public class DefaultHelloWorld implements HelloWorld {

	@Override
	public String hello(String name) {
		if (Math.random() > 0.5) {
			throw new IllegalStateException();
		}
		return "Hello " + name;
	}

}
