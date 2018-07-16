package szu.vander.hometheater;
/**
* @author : Vander Choi
* @date : 2018-07-09
* @description :
*/
public class Projector {
	
	private DvdPlayer dvdPlayer;
	
	public void on() {
		System.out.println("Open Projecter!");
		if(this.dvdPlayer != null) {
			System.out.println("Projector Connect to DvdPlayer");
		}
	}
	
	public void off() {
		System.out.println("Close Projecter!");
	}
	
	public void setDvdPlayer(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}
	
	public void tvMode() {
		System.out.println("Project is on TV Mode");
	}
	
	public void wideScreenMode() {
		System.out.println("Project is on Wide Screen Mode");
	}
	
}
