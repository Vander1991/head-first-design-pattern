package szu.vander.control.command;

import szu.vander.control.appliance.Television;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class TelevisionOnCommand implements Command {

	private Television television;
	
	public TelevisionOnCommand(Television televison) {
		this.television = televison;
	}
	
	public void excute() {
		television.on();
	}

}
