package szu.vander.impl1;
/**
* @author : Vander Choi
* @date : 2018-07-25
* @description :
*/
public class Main {

	public static void main(String args[]) {
		BarbecueMenu barbecueMenu = new BarbecueMenu();
		PizzaMenu pizzaMenu = new PizzaMenu();
		MenuAdmin menuAdmin = new MenuAdmin(barbecueMenu, pizzaMenu);
		menuAdmin.displayMenu();
	}
	
}
