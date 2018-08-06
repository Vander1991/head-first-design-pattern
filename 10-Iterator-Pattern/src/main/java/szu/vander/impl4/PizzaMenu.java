package szu.vander.impl4;

import java.util.ArrayList;
import java.util.Iterator;

/**
* @author : Vander Choi
* @date : 2018-07-25
* @description :
*/
public class PizzaMenu implements Menu<MenuItem> {

	private ArrayList<MenuItem> menuItems;
	
	public PizzaMenu() {
		menuItems = new ArrayList<MenuItem>();
		menuItems.add(new MenuItem("FruitPizza", "Hawaii Style", 38.0));
		menuItems.add(new MenuItem("BuffPizza", "American Style", 28.0));
		menuItems.add(new MenuItem("TunaPizza", "Japan Style", 18.0));
	}
	
	public void addItem(MenuItem menuIterm) {
		menuItems.add(menuIterm);
	}

	public Iterator<MenuItem> createIterator() {
		Iterator<MenuItem> menuItemIterator =  menuItems.iterator();
		return menuItemIterator;
	}

	public void setMenuItem(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
}
