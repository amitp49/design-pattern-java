package Command;

public class SimpleRemoteControl {
	private Command slot;

	/**
	 * @param slot
	 */
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed()
	{
		slot.execute();
	}
	
	public void undoButtonWasPressed()
	{
		slot.undo();
	}
}
