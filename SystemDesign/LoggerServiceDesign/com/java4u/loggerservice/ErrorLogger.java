package com.java4u.loggerservice;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Error:: Logger "+message);
	}

}
