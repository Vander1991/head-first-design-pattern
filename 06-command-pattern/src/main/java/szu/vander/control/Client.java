package szu.vander.control;

import szu.vander.control.appliance.AirCondition;
import szu.vander.control.appliance.Hottub;
import szu.vander.control.appliance.Light;
import szu.vander.control.appliance.Refrigerator;
import szu.vander.control.appliance.Television;
import szu.vander.control.command.AirConditionOffCommand;
import szu.vander.control.command.AirConditionOnCommand;
import szu.vander.control.command.Command;
import szu.vander.control.command.HottubOffCommand;
import szu.vander.control.command.HottubOnCommand;
import szu.vander.control.command.LightOffCommand;
import szu.vander.control.command.LightOnCommand;
import szu.vander.control.command.NoCommand;
import szu.vander.control.command.RefrigeratorOffCommand;
import szu.vander.control.command.RefrigeratorOnCommand;
import szu.vander.control.command.TelevisionOffCommand;
import szu.vander.control.command.TelevisionOnCommand;

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
		} else if(type.equals("hottubOn")) {
			return new HottubOnCommand((Hottub)object);
		} else if(type.equals("hottubOff")) {
			return new HottubOffCommand((Hottub)object);
		} else if(type.equals("refrigeratorOn")) {
			return new RefrigeratorOnCommand((Refrigerator)object);
		} else if(type.equals("refrigeratorOff")) {
			return new RefrigeratorOffCommand((Refrigerator)object);
		} else if(type.equals("televisionOn")) {
			return new TelevisionOnCommand((Television)object);
		} else if(type.equals("televisionOff")) {
			return new TelevisionOffCommand((Television)object);
		} else if(type.equals("lightOff")) {
			return new LightOnCommand((Light)object);
		} else if(type.equals("lightOff")) {
			return new LightOffCommand((Light)object);
		} else {
			return new NoCommand();
		}
	}
	
}
