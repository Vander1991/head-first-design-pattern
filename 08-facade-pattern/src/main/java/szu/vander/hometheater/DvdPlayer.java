package szu.vander.hometheater;
/**
* @author : Vander Choi
* @date : 2018-07-08
* @description :
*/
public class DvdPlayer {

	private Amplifier amplifier;

	public void setAmplifier(Amplifier amplifier){
		this.amplifier = amplifier;
	}
	
	public void on() {
		System.out.println("Open DVD Player!");
	}
	
	public void off() {
		System.out.println("Close DVD Player!");
	}
	
	public void setVolume(int volume) {
		amplifier.setVolume(volume);
	}
	
	public void play(String moive) {
		System.out.println("play moive ：" + moive);
	}
	
}
