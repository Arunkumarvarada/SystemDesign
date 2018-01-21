package com.java4u.loggerservice;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard File:: Logger "+message);
	}

}
