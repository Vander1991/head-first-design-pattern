package szu.vander.menu2;

import java.util.ArrayList;
import java.util.Iterator;

/**
* @author      : Vander
* @date        : 2018-08-01
* @description ： 
*/
public class Menu extends MenuComponent {

	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	
	private String name;
	
	private String desc;

	public Menu(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public void print() {
		System.out.println("name:" + getName() + "#desc:" + getDesc());
	}
	
	@Override
	public Iterator<MenuComponent> createIteractor() {
		return new CompositeIterator(menuComponents.iterator());
	}
	
}
