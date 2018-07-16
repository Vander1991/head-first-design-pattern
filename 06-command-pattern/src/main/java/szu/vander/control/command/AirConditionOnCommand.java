package szu.vander.control.command;

import szu.vander.control.appliance.AirCondition;

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
		airCondition.setState(airCondition.getState());
		airCondition.setTemperature(airCondition.getTemperture());
		airCondition.on();
	}

}
