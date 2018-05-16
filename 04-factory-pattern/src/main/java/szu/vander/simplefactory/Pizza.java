package szu.vander.simplefactory;

import java.util.ArrayList;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class Pizza {

	private String name;
	//面团类型
	private String dough;
	//酱料
	private String sauce;
	//佐料	
	private ArrayList<String> toppings = new ArrayList<String>(10);
	
	public void prepare() {
		System.out.println("preparing" + this.name);
	}
	
	public void bake() {
		System.out.println("Bake for 25 mins at 350℃");
	}
	
	public void cut() {
		System.out.println("Cut the pizza");
	}

	public void box() {
		System.out.println("Box the pizza");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public ArrayList<String> getToppings() {
		return toppings;
	}

	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}
	
}
