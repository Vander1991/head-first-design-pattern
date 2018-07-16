package szu.vander.control.command;

import szu.vander.control.appliance.Television;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class TelevisionOffCommand implements Command {

	private Television television;
	
	public TelevisionOffCommand(Television televison) {
		this.television = televison;
	}
	
	public void excute() {
		television.off();
	}

}
