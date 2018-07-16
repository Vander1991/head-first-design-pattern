package szu.vander.further.command;

/**
* @author : Vander Choi
* @date : 2018-06-18
* @description :
*/
public class CombineCommand implements Command {

	private Command[] commands;
	
	public CombineCommand(Command[] commands){
		this.commands = commands;
		for(int i=0; i<commands.length; i++) {
			if(commands[i] == null) {
				commands[i] = new NoCommand();
			}
		}
	}
	
	public void excute() {
		for(int i=0; i<commands.length; i++) {
			commands[i].excute();
		}
	}

	public void undo() {
		for(int i=0; i<commands.length; i++) {
			commands[i].undo();
		}
	}
	
}
