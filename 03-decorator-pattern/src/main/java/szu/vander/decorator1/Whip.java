package szu.vander.decorator1;
/**
* @author : Vander Choi
* @date : 2018-04-17
* @description :
*/
public class Whip implements CondimentDecorator {

	private Beverage beverage;
	
	public float cost() {
		return beverage.cost() + 2.0f;
	}
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDesc() {
		return this.beverage.getDesc() + " with " + "Whip";
	}

}
