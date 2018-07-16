package szu.vander.further;

import szu.vander.further.appliance.AirCondition;
import szu.vander.further.appliance.Light;
import szu.vander.further.command.AirConditionOffCommand;
import szu.vander.further.command.AirConditionOnCommand;
import szu.vander.further.command.Command;
import szu.vander.further.command.LightOffCommand;
import szu.vander.further.command.LightOnCommand;
import szu.vander.further.command.NoCommand;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class Client {

	public static Command createCommad(String type, Object object) {
		if(type.equals("lightOn")) {
			return new LightOnCommand((Light)object);
		} else if(type.equals("lightOff")) {
			return new LightOffCommand((Light)object);
		} else if(type.equals("airConditionOn")) {
			return new AirConditionOnCommand((AirCondition)object);
		} else if(type.equals("airConditionOff")) {
			return new AirConditionOffCommand((AirCondition)object);
		} else {
			return new NoCommand();
		}
	}
	
}
