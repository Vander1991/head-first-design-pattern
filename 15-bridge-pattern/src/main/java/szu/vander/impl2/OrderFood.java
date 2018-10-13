package szu.vander.impl2;
/**
* @author      : Vander
* @date        : 2018-10-02
* @description ： 
*/
public class OrderFood {

	public static void main(String[] args) {
		Restaurant restaurant;
		restaurant = new MacDonald();
		restaurant.setFoodFactory(new FriedChickenFactory());
		restaurant.makeFood();
		restaurant.setFoodFactory(new HamburgFactory());
		restaurant.makeFood();
		restaurant = new Kentucky();
		restaurant.setFoodFactory(new FriedChickenFactory());
		restaurant.makeFood();
		restaurant.setFoodFactory(new HamburgFactory());
		restaurant.makeFood();
	}

}
