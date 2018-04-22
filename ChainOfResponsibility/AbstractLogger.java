package ChainOfResponsibility;

public abstract class AbstractLogger {

	protected int level;

	AbstractLogger(int level)
    {
        this.level = level;
    }

	// next element in chain or responsibility
	protected AbstractLogger nextLogger;

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		if (canProcessRequest(level)) {
			write(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected boolean canProcessRequest(int level);
	abstract protected void write(String message);
}
