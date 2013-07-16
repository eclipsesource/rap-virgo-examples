package com.eclipsesource.virgo.examples.blueprint.cm;

import java.util.Map;
import java.util.Map.Entry;

public class SelfManagedBean {

	public void updateCallback(Map<String, String> properties) {
		System.out.println("Received properties:");
		for (Entry<String,String> each : properties.entrySet()) {
			System.out.println(each.getKey() + "=" + each.getValue());
		}
	}
}
