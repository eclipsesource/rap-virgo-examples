package com.eclipsesource.rap.virgo.demo;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.rwt.application.Application;
import org.eclipse.rwt.application.ApplicationConfiguration;
import org.eclipse.rwt.client.WebClient;
import org.eclipse.rwt.lifecycle.IEntryPointFactory;

public class DemoApplicationConfiguration implements ApplicationConfiguration {

	private IEntryPointFactory entryPointFactory;
	
	public void setEntryPointFactory(IEntryPointFactory entryPointFactory) {
		this.entryPointFactory = entryPointFactory;
	}

	@Override
	public void configure(Application application) {
		Map<String, String> properties = new HashMap<String, String>();
		properties.put(WebClient.PAGE_TITLE, "RAP Virgo Demo");
		application.addEntryPoint("/virgo_demo", this.entryPointFactory, properties );
	}

}
