package szu.vander.demeter;
/**
* @author      : caiwj
* @date        : 2018-07-10
* @description ： 
*/
public class Car {
	
	Engine engine;

	public void start(Key key){
		Doors doors = new Doors();
		boolean authorized = key.turns();

		if(authorized){
			engine.start();
			updateDashboardDisplay();
			doors.lock();
		}
		
	}

	private void updateDashboardDisplay() {
		
	}

}


