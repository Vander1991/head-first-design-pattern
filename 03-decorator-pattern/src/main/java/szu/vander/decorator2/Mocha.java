package szu.vander.decorator2;

import java.util.ArrayList;

/**
* @author : Vander Choi
* @date : 2018-04-17
* @description :
*/
public class Mocha extends CondimentDecorator {

	private Beverage beverage;
	
	public float cost() {
		String size = this.beverage.getSize(); 
		switch(size) {
			case "tall" : return beverage.cost() + 1.0f; 
			case "grande" : return beverage.cost() + 1.5f; 
			case "venti" : return beverage.cost() + 2.0f; 
			default : return beverage.cost();
		}
	}
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.setSize(this.beverage.getSize());
	}

	public ArrayList<String> getDesc() {
		ArrayList<String> descList = beverage.getDesc();
		descList.add("Mocha");
		return descList;
	}
}
