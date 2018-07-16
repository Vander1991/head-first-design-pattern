package szu.vander.control;

import szu.vander.control.command.Command;
import szu.vander.control.command.NoCommand;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class RemoteControl {
	
	private Command onButton[];
	
	private Command offButton[];
	
	public RemoteControl() {
		
		onButton = new Command[7];
		offButton = new Command[7];
		
		for(int i=0; i<onButton.length; i++) {
			onButton[i] = new NoCommand();
			offButton[i] = new NoCommand();
		}
		
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onButton[slot] = onCommand;
		offButton[slot] = offCommand;
	}
	
	public void pushOnButton(int slot) {
		onButton[slot].excute();
	}
	
	public void pushOffButton(int slot) {
		offButton[slot].excute();
	}
	
}
