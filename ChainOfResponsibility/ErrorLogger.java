package ChainOfResponsibility;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		super(level);
	}

	@Override
	protected boolean canProcessRequest(int level) {
		if (this.level <= level) //TODO: Can add more logic here specific to this logger when to log
			return true;
		else
			return false;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}
}