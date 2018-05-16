package szu.vander.decorator1;
/**
* @author : Vander Choi
* @date : 2018-04-17
* @description :
*/
public class DarkRoast implements Beverage {

	public float cost() {
		return 10.0f;
	}

	public String getDesc() {
		return "DarkRoast";
	}
	
}
