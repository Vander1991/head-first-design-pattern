package szu.vander.decorator1;
/**
* @author : Vander Choi
* @date : 2018-04-17
* @description :
*/
public class Mocha implements CondimentDecorator {

	private Beverage beverage;
	
	public float cost() {
		return this.beverage.cost() + 1.0f;
	}
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDesc() {
		return this.beverage.getDesc() + " with " + "Mocha";
	}

}
