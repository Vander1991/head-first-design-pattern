package szu.vander.impl2;
/**
* @author      : Vander
* @date        : 2018-10-02
* @description ： 
*/
public abstract class Restaurant {

	private FoodFactory foodFactory;
	
	protected void makeFood() {
		foodFactory.makeFood();
	}
	
	public void setFoodFactory(FoodFactory foodFactory) {
		this.foodFactory = foodFactory;
	}
	
}
