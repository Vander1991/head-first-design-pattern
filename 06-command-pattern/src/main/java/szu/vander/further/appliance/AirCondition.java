package szu.vander.further.appliance;
/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class AirCondition {

	private int temperture;
	
	private int preTemperature;
	
	private String state;
	
	private String preState;
	
	public void on() {
		System.out.println("Aircondition is on with state is " + state
			+ " and the temperature is " + temperture + "℃ !");
	}
	
	public void setState(String state) {
		preState = this.state;
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public int getTemperture() {
		return temperture;
	}

	public void setTemperature(int temp) {
		preTemperature = this.temperture;
		this.temperture = temp;
	}
	
	public void off() {
		System.out.println("Airconditon is off!");
	}
	
	public void undo() {
		this.state = preState;
		this.temperture = preTemperature;
		System.out.println("Aircondition is on with state is " + state
				+ " and the temperature is " + temperture + "℃ !");
	}
	
}
