package szu.vander.further.command;

import szu.vander.further.appliance.Light;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class LightOnCommand implements Command {
	
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void excute() {
		light.on();
	}

	public void undo() {
		light.off();
	}
	
}
