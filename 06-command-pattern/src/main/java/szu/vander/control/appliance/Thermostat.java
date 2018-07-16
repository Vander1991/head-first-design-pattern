package szu.vander.control.appliance;
/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class Thermostat {

	public void on() {
		System.out.println(this.getClass().getSimpleName() + "is on!");
	}
	
	public void off() {
		System.out.println(this.getClass().getSimpleName() + "is off!");
	}
	
}
