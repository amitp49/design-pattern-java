package Command;

public class FanOnCommand implements Command{
	Fan fan;
	
	
	/**
	 * @param light
	 */
	public FanOnCommand(Fan fan) {
		super();
		this.fan = fan;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.on();
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fan.off();
	}

}

