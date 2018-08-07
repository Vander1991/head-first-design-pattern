package szu.vander.impl3;

import java.util.Iterator;

/**
 * @author : Vander Choi
 * @date : 2018-07-25
 * @description :
 */
public class MenuAdmin {

	private Menu<MenuItem> barbecueMenu;

	private Menu<MenuItem> pizzaMenu;

	public MenuAdmin(Menu<MenuItem> barbecueMenu, Menu<MenuItem> pizzaMenu) {
		super();
		this.barbecueMenu = barbecueMenu;
		this.pizzaMenu = pizzaMenu;
	}
	
	public void displayMenus() {
		traverseMenus(barbecueMenu.createIterator());
		traverseMenus(pizzaMenu.createIterator());
	}
	
	public void traverseMenus(Iterator<MenuItem> iterator) {
		while(iterator.hasNext()) {
			System.out.println("name:" + iterator.next().getName() + "-desc:" + iterator.next().getDesc()
					+ "-price:" + iterator.next().getPrice());
		}
	}
	
}
