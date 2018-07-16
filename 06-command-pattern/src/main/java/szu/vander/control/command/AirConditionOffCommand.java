package szu.vander.control.command;

import szu.vander.control.appliance.AirCondition;

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

}
