package szu.vander.impl4;

import java.util.ArrayList;
import java.util.List;

/**
* @author      : Vander Choi
* @date        : 2018-07-26
* @description ： 
*/
public class Main {

	public static void main(String[] args) {
		BarbecueMenu barbecueMenu = new BarbecueMenu();
		PizzaMenu pizzaMenu = new PizzaMenu();
		HotPotMenu hotPotMenu = new HotPotMenu();
		List<Menu<MenuItem>> menuList = new ArrayList<Menu<MenuItem>>();
		menuList.add(barbecueMenu);
		menuList.add(pizzaMenu);
		menuList.add(hotPotMenu);
		MenuAdmin menuAdmin = new MenuAdmin(menuList);
		menuAdmin.displayMenus();
	}

}
