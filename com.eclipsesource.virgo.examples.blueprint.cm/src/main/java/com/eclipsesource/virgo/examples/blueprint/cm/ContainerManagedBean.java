package com.eclipsesource.virgo.examples.blueprint.cm;

public class ContainerManagedBean {

	private Integer integer;

	public Integer getInteger() {
		return integer;
	}

	public void setInteger(Integer integer) {
		System.out.println("Updating integer value to: " + integer);
		this.integer = integer;
	}
}
