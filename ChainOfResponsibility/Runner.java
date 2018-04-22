package ChainOfResponsibility;

public class Runner {
	public static void main(String[] args) {
		AbstractLogger errorLogger = new ErrorLogger(3);
		AbstractLogger fileLogger = new FileLogger(2);
		AbstractLogger consoleLogger = new ConsoleLogger(1);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		AbstractLogger loggerChain = errorLogger;

		loggerChain.logMessage(1, "This is an information.");

		loggerChain.logMessage(2,
				"This is an debug level information.");

		loggerChain.logMessage(3,
				"This is an error information.");
	}
}
