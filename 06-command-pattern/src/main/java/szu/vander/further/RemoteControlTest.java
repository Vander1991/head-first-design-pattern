package szu.vander.further;

import szu.vander.further.appliance.AirCondition;
import szu.vander.further.appliance.Light;
import szu.vander.further.command.Command;
import szu.vander.further.command.CombineCommand;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class RemoteControlTest {

	public static void main(String[] args) {
		
		Light light = new Light("Dining room");
		Command lightOnCommand = Client.createCommad("lightOn", light);
		Command lightOffCommand = Client.createCommad("lightOff", light);
		AirCondition airCondition = new AirCondition();
		airCondition.setState("Cool");
		airCondition.setTemperature(18);
		Command airConditionOnCommand = Client.createCommad("airConditionOn", airCondition);
		Command airConditionOffCommand = Client.createCommad("airConditionOff", airCondition);
		
		Command[] combinesOn = {lightOnCommand, airConditionOnCommand};
		Command combineOnCommands = new CombineCommand(combinesOn);
		Command[] combinesOff = {lightOffCommand, airConditionOffCommand};
		Command combineOffCommands = new CombineCommand(combinesOff);
		
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.setCommand(1, airConditionOnCommand, airConditionOffCommand);
		remoteControl.setCommand(2, combineOnCommands, combineOffCommands);
		
		remoteControl.pushOnButton(1);
		remoteControl.pushOffButton(2);
		remoteControl.pushUndoButton();
	}

}
