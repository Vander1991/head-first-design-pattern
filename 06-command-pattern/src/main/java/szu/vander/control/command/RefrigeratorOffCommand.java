package szu.vander.control.command;

import szu.vander.control.appliance.Refrigerator;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class RefrigeratorOffCommand implements Command {

	private Refrigerator refrigerator;
	
	public RefrigeratorOffCommand(Refrigerator refrigerator) {
		this.refrigerator = refrigerator;
	}
	
	public void excute() {
		refrigerator.off();
	}

}
