package stu1901321020;

public class RemoteController {

	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void say() {
		if(this.command == null) {
			System.out.println("No cammand set!");
			return;
		}
		this.command.execute();
	}

}
