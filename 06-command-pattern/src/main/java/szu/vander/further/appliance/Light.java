package szu.vander.further.appliance;
/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class Light {

	private String position;
	
	public Light(String position) {
		this.position = position;
	}
	
	public void on() {
		System.out.println(position + " Light has be on!");
	}

	public void off() {
		System.out.println(position + " Light has be off!");
	}

	
}
