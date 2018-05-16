package szu.vander.abstractfactory;
/**
* @author : Vander Choi
* @date : 2018-04-26
* @description :
*/
public class Beverage {
	
	protected String name;
	
	public void prepare() {
		System.out.println("Preparing " + name + "...");
	}
	
}
