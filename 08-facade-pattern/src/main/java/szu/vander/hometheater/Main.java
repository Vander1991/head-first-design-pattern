package szu.vander.hometheater;
/**
* @author : Vander Choi
* @date : 2018-07-10
* @description :
*/
public class Main {

	public static void main(String[] args) {
		AirCondition airCondition = new AirCondition();
		Amplifier amplifier = new Amplifier();
		DvdPlayer dvdPlayer = new DvdPlayer();
		Projector projector = new Projector();
		Screen screen = new Screen();
		Television television = new Television();
		TheaterLight theaterLight = new TheaterLight();
		
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, 
				dvdPlayer, airCondition, projector, screen, theaterLight, television);
		homeTheaterFacade.watchMoive("火影忍者");
		System.out.println("--------An hour later-------");
		homeTheaterFacade.endMoive();
	}

}
