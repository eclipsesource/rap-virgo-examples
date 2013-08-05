package com.eclipsesource.virgo.examples.blueprint.cm;

public class EngineOrderTelegraph {

	private String order;

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		System.out.println("Engine order changed to '" + order + "'");
		this.order = order;
	}
}
