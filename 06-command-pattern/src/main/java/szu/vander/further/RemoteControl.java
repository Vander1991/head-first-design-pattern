package szu.vander.further;

import szu.vander.further.command.Command;
import szu.vander.further.command.NoCommand;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class RemoteControl {
	
	private Command onButton[];
	
	private Command offButton[];
	
	private Command undoCommand;
	
	public RemoteControl() {
		
		onButton = new Command[7];
		offButton = new Command[7];
		
		for(int i=0; i<onButton.length; i++) {
			onButton[i] = new NoCommand();
			offButton[i] = new NoCommand();
		}
		undoCommand = new NoCommand();
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onButton[slot] = onCommand;
		offButton[slot] = offCommand;
	}
	
	public void pushOnButton(int slot) {
		onButton[slot].excute();
		undoCommand = onButton[slot];
	}
	
	public void pushOffButton(int slot) {
		offButton[slot].excute();
		undoCommand = offButton[slot];
	}
	
	public void pushUndoButton() {
		undoCommand.undo();
	}
	
}
