package szu.vander.beverage3;
/**
* @author      : caiwj
* @date        : 2018-07-12
* @description ： 
*/
public abstract class Beverage {

	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customCondiments()) {
			addCondiments();
		}
	}
	
	public void boilWater() {
		System.out.println("Boiling water");
	}
	
	abstract void brew();
	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	abstract void addCondiments();
	
	public boolean customCondiments() {
		return true;
	}
	
}
