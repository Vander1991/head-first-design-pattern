package szu.vander.abstractfactory;

import java.util.ArrayList;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public abstract class Pizza {

	protected String name;
	//面团类型
	protected String dough;
	//酱料
	protected String sauce;
	//佐料	
	protected ArrayList<String> toppings = new ArrayList<String>(10);
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println(" Tossing dough ...");
		System.out.println(" Adding sauce ...");
		System.out.println(" Adding toppings: ");
		for(int i=0; i<toppings.size(); i++) {
			System.out.println("  " + toppings.get(i));
		}
	}
	
	public void bake() {
		System.out.println("Bake for 25 mins at 350℃");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Boxing the pizza");
	}
	
	public String getName() {
		return name;
	}
	
}
