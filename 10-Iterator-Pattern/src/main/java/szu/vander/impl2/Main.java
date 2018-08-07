package szu.vander.impl2;

import szu.vander.impl1.BarbecueMenu;
import szu.vander.impl1.MenuAdmin;
import szu.vander.impl1.PizzaMenu;

/**
* @author      : Vander Choi
* @date        : 2018-07-26
* @description ： 
*/
public class Main {

	public static void main(String[] args) {
		BarbecueMenu barbecueMenu = new BarbecueMenu();
		PizzaMenu pizzaMenu = new PizzaMenu();
		MenuAdmin menuAdmin = new MenuAdmin(barbecueMenu, pizzaMenu);
		menuAdmin.displayMenu();
	}

}
