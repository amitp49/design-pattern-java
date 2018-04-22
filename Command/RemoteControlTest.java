package Command;

public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Light light = new Light();
		Fan fan = new Fan();
		//LightOnCommand lightOnCommand = new LightOnCommand(light);
		//LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		//simpleRemoteControl.setCommand(lightOffCommand);
		//simpleRemoteControl.buttonWasPressed();
		//simpleRemoteControl.undoButtonWasPressed();
		
		Command[] commands = {new LightOnCommand(light), new FanOnCommand(fan)};
		EnterHomeMacroCommand enterHomeMacroCommand = new EnterHomeMacroCommand(commands);
		enterHomeMacroCommand.execute();
	}

}
