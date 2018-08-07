package szu.vander.impl1;

import java.util.ArrayList;

/**
 * @author : Vander Choi
 * @date : 2018-07-25
 * @description :
 */
public class MenuAdmin {

	private BarbecueMenu barbecueMenu;

	private PizzaMenu pizzaMenu;

	public MenuAdmin(BarbecueMenu barbecueMenu, PizzaMenu pizzaMenu) {
		super();
		this.barbecueMenu = barbecueMenu;
		this.pizzaMenu = pizzaMenu;
	}

	public void displayMenu() {
		MenuItem[] barbecueItems = barbecueMenu.getMenuItems();
		ArrayList<MenuItem> pizzaItems = pizzaMenu.getMenuItem();
		for (int i = 0; i < barbecueItems.length; i++) {//数组的大小为5
			if(barbecueItems[i] != null) {
				System.out.println("name:" + barbecueItems[i].getName() + "-desc:" + barbecueItems[i].getDesc()
						+ "-price:" + barbecueItems[i].getPrice());
			}
		}
		
		for(MenuItem item : pizzaItems) {
			System.out.println("name:" + item.getName() + "-desc:" + item.getDesc()
					+ "-price:" + item.getPrice());
		}

	}

}
