package szu.vander.hometheater;
/**
* @author : Vander Choi
* @date : 2018-07-08
* @description :
*/
public class Television {
	
	private Amplifier amplifier;

	public void on() {
		System.out.println("Open Television!");
	}
	
	public void off() {
		System.out.println("Close Television!");
	}
	
	public void setVolume(int volume) {
		amplifier.setVolume(volume);
	}
	
}
