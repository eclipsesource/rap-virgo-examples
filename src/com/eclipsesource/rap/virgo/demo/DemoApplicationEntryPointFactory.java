package com.eclipsesource.rap.virgo.demo;

import org.eclipse.rwt.lifecycle.IEntryPoint;
import org.eclipse.rwt.lifecycle.IEntryPointFactory;


public class DemoApplicationEntryPointFactory implements IEntryPointFactory {

	private IEntryPoint entryPoint;

	public IEntryPoint create() {
		return entryPoint;
	}

	public void setEntryPoint(IEntryPoint entryPoint) {
		this.entryPoint = entryPoint;
	}
}
