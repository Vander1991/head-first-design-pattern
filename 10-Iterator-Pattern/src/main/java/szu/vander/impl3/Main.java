package szu.vander.impl3;

/**
* @author      : Vander Choi
* @date        : 2018-07-26
* @description ： 
*/
public class Main {

	public static void main(String[] args) {
		Menu<MenuItem> barbecueMenu = new BarbecueMenu();
		Menu<MenuItem> pizzaMenu = new PizzaMenu();
		MenuAdmin menuAdmin = new MenuAdmin(barbecueMenu, pizzaMenu);
		menuAdmin.displayMenus();
	}

}
