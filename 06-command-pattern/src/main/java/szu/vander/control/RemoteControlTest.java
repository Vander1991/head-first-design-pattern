package szu.vander.control;

import szu.vander.control.appliance.AirCondition;
import szu.vander.control.appliance.Light;
import szu.vander.control.command.Command;

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
		RemoteControl remoteControl = new RemoteControl();
		AirCondition airCondition = new AirCondition();
		Command airConditionOnCommand = Client.createCommad("airConditionOn", airCondition);
		Command airConditionOffCommand = Client.createCommad("airConditionOff", airCondition);
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.setCommand(1, airConditionOnCommand, airConditionOffCommand);
		remoteControl.pushOnButton(0);
		remoteControl.pushOffButton(0);
		remoteControl.pushOnButton(1);
		remoteControl.pushOffButton(1);
	}

}
