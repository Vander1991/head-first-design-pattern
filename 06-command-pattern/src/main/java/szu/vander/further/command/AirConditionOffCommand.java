package szu.vander.further.command;

import szu.vander.further.appliance.AirCondition;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class AirConditionOffCommand implements Command {

	private AirCondition airCondition;
	
	public AirConditionOffCommand(AirCondition airCondition) {
		this.airCondition = airCondition;
	}
	
	public void excute() {
		airCondition.off();
	}

	public void undo() {
		airCondition.undo();
	}

}
