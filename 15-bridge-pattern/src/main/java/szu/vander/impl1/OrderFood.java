package szu.vander.impl1;
/**
* @author      : Vander
* @date        : 2018-10-02
* @description ： 
*/
public class OrderFood {

	public static void main(String[] args) {
		Restaurant restaurant;
		restaurant = new MacDonaldHamburgFactory();
		restaurant.makeFood();
		restaurant = new MacDonaldFriedChickenFactory();
		restaurant.makeFood();
		restaurant = new KentuckyHamburgFactory();
		restaurant.makeFood();
		restaurant = new KentuckyFriedChickenFactory();
		restaurant.makeFood();
	}

}
