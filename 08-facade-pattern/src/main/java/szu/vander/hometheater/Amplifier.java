package szu.vander.hometheater;
/**
* @author : Vander Choi
* @date : 2018-07-08
* @description :
*/
public class Amplifier {

	private DvdPlayer dvdPlayer;

	private Television television;
	
	private int volume;
	
	public void on() {
		System.out.println("Open Amplifier!");
	}
	
	public void off() {
		System.out.println("Close Amplifier!");
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void setDvdPlayer(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}

	public void setTelevision(Television television) {
		this.television = television;
	}
	
	public void play() {
		if(this.dvdPlayer != null) {
			System.out.println("Connect Dvd Player");
		} else if(this.television != null ) {
			System.out.println("Connect Television");
		} else {
			System.out.println("Connect Nothing");
		}
		System.out.println("Amplifier is" + this.volume);
	}
	
}
