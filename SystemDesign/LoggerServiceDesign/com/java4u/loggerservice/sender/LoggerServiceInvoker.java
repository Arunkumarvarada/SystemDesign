package com.java4u.loggerservice.sender;

import com.java4u.loggerservice.AbstractLogger;
import com.java4u.loggerservice.ConsoleLogger;
import com.java4u.loggerservice.ErrorLogger;
import com.java4u.loggerservice.FileLogger;

public class LoggerServiceInvoker {

	private static AbstractLogger getLogger() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;

	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getLogger();
		loggerChain.logMessage(AbstractLogger.INFO, "This is an Information");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an Debug level Information");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an Error level Information");
	}

}
