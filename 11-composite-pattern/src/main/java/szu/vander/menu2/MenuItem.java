package szu.vander.menu2;

import java.util.Iterator;

/**
* @author      : Vander
* @date        : 2018-08-01
* @description ： 
*/
public class MenuItem extends MenuComponent {

	private String name;
	
	private String desc;
	
	private double price;

	public MenuItem(String name, String desc, double price) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public double getPrice() {
		return price;
	}
	
	public void print() {
		System.out.println("name:" + getName() + "#desc:" + getDesc() + "#price:" + getPrice());
	}

	@Override
	public Iterator<MenuComponent> createIteractor() {
		return new NullIterator();
	}

}
