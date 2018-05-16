package szu.vander.wrong2;
/**
* @author : Vander Choi
* @date : 2018-04-15
* @description :
*/
public class Decaf extends Beverage {

	private float cost;
	
	public float getCost() {
		return cost + super.cost();
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
