package szu.vander.decorator2;

import java.util.ArrayList;

/**
* @author : Vander Choi
* @date : 2018-04-17
* @description :
*/
public class DarkRoast extends Beverage {

	public float cost() {
		return 10.0f;
	}

	public ArrayList<String> getDesc() {
		ArrayList<String> descList = super.getDesc();
		descList.add("DarkRoast");
		return descList;
	}
	
	
	
}
