package com.datadoghq;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import datadog.trace.api.Trace;

public class FelixBundle implements BundleActivator {

	@Override
	@Trace
	public void start(BundleContext arg0) throws Exception {
		System.out.println("Starting...");
		
	}

	@Override
	@Trace
	public void stop(BundleContext arg0) throws Exception {
		System.out.println("Leaving...");
		
	}

}
