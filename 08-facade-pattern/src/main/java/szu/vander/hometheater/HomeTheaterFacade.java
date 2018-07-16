package szu.vander.hometheater;
/**
* @author : Vander Choi
* @date : 2018-07-08
* @description :
*/
public class HomeTheaterFacade {

	private Amplifier amp;
	
	private DvdPlayer dvd;
	
	private AirCondition airCondition;
	
	private Projector projector;
	
	private Screen screen;
	
	private TheaterLight theaterLight;
	
	private Television television;

	public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, AirCondition airCondition, Projector projector,
			Screen screen, TheaterLight theaterLight, Television television) {
		super();
		this.amp = amp;
		this.dvd = dvd;
		this.airCondition = airCondition;
		this.projector = projector;
		this.screen = screen;
		this.theaterLight = theaterLight;
		this.television = television;
	}
	
	public void watchMoive(String moive) {
		theaterLight.on();
		theaterLight.dim();
		screen.down();
		airCondition.on();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvdPlayer(dvd);
		dvd.setAmplifier(amp);
		dvd.on();
		dvd.setVolume(10);
		dvd.play(moive);
	}
	
	public void endMoive() {
		screen.up();
		airCondition.off();
		projector.off();
		amp.off();
		dvd.off();
		theaterLight.off();
	}
	
	public void watchTv() {
		theaterLight.on();
		airCondition.on();
		amp.on();
		amp.setTelevision(television);
		television.on();
	}
	
	public void closeTv() {
		television.off();
		theaterLight.off();
		airCondition.off();
		amp.off();
	}
	
}
