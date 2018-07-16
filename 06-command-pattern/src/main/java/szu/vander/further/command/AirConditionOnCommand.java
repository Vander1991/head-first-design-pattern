package szu.vander.further.command;

import szu.vander.further.appliance.AirCondition;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class AirConditionOnCommand implements Command {

	private AirCondition airCondition;
	
	public AirConditionOnCommand(AirCondition airCondition) {
		this.airCondition = airCondition;
	}
	
	public void excute() {
		airCondition.setTemperature(airCondition.getTemperture());
		airCondition.setState(airCondition.getState());
		airCondition.on();
	}

	public void undo() {
		airCondition.off();
	}

}
