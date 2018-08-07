package szu.vander.menu2;

import java.util.Iterator;

/**
* @author      : Vander
* @date        : 2018-08-01
* @description ： 
*/
public class MenuAdmin {

	private MenuComponent menuComponent;

	public MenuAdmin(MenuComponent menuComponent) {
		super();
		this.menuComponent = menuComponent;
	}

	public void print() {
		Iterator<MenuComponent> iterator =menuComponent.createIteractor();
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
	
}
