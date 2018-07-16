package szu.vander.control.command;

import szu.vander.control.appliance.Light;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class LightOffCommand implements Command {
	
	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	public void excute() {
		light.off();
	}
	
}
