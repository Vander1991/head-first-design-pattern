package szu.vander.decorator2;

import java.util.ArrayList;

/**
* @author : Vander Choi
* @date : 2018-04-14
* @description :
*/
public abstract class Beverage {

	private String size;

	public ArrayList<String> getDesc(){
		ArrayList<String> descList = new ArrayList<String>();
		return descList;
	}

	public abstract float cost();
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public void condimentPrettyPrint() {
		ArrayList<String> descList = getDesc();
		for(String condiment : descList) {
			System.out.print(condiment + " ");
		}
	}
	
}
