package szu.vander.impl2;

import java.util.ArrayList;

/**
 * 
* @author      : Vander Choi
* @date        : 2018-07-26
* @description ：
 */
public class PizzaMenuIterator implements Iterator<MenuItem> {

	private ArrayList<MenuItem> menuItems;
	
	private int position = 0;
	
	public PizzaMenuIterator(ArrayList<MenuItem> menuItems) {
		super();
		this.menuItems = menuItems;
	}

	public boolean hasNext() {
		if(menuItems.get(position) != null) {
			return true;
		}
		return false;
	}

	public MenuItem next() {
		if(menuItems.get(position) != null) {
			MenuItem item = menuItems.get(position);  
			position++;
			return item;
		}
		return null;
	}

}
