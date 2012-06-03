package org.jsmpp.util;

import java.util.concurrent.ThreadFactory;

public class ThreadFactory_jsmpp implements ThreadFactory {
	int numThreads = 0;
	String prefix;

	public ThreadFactory_jsmpp(String prefix)
	{
		this.prefix = prefix;
	}

	public synchronized Thread newThread(Runnable r) {
		numThreads++;
		return new Thread(r, prefix + "_" + numThreads);
	}
}
