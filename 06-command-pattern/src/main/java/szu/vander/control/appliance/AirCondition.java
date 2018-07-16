package szu.vander.control.appliance;
/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class AirCondition {

	private int temperture;
	
	private String state;
	
	public void on() {
		System.out.println("Aircondition is on with state is " + state
			+ " and the temperature is " + temperture + "℃ !");
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setTemperature(int temp) {
		this.temperture = temp;
	}
	
	public int getTemperture() {
		return temperture;
	}

	public void setTemperture(int temperture) {
		this.temperture = temperture;
	}

	public String getState() {
		return state;
	}

	public void off() {
		System.out.println("Airconditon is off!");
	}
	
}

