package szu.vander.factorymethod;

import java.util.ArrayList;

public abstract class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;
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
