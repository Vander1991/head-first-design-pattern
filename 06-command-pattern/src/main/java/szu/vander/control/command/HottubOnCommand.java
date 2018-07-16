package szu.vander.control.command;

import szu.vander.control.appliance.Hottub;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class HottubOnCommand implements Command {

	private Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	
	public void excute() {
		hottub.on();
	}

}
