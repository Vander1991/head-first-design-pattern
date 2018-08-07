package szu.vander.impl1;

import java.util.ArrayList;

/**
* @author : Vander Choi
* @date : 2018-07-25
* @description :
*/
public class PizzaMenu {

	private ArrayList<MenuItem> menuItem;
	
	public PizzaMenu() {
		menuItem = new ArrayList<MenuItem>();
		menuItem.add(new MenuItem("FruitPizza", "Hawaii Style", 38.0));
		menuItem.add(new MenuItem("BuffPizza", "American Style", 28.0));
		menuItem.add(new MenuItem("TunaPizza", "Japan Style", 18.0));
	}
	
	public void addItem(MenuItem iterm) {
		menuItem.add(iterm);
	}

	public ArrayList<MenuItem> getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(ArrayList<MenuItem> menuItem) {
		this.menuItem = menuItem;
	}
	
}
