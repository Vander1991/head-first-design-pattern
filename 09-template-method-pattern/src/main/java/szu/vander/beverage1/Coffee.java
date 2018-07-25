package szu.vander.beverage1;
/**
* @author      : caiwj
* @date        : 2018-07-10
* @description ： 
*/
public class Coffee {

	void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	public void boilWater() {
		System.out.println("Boiling water");
	}

	public void brewCoffeeGrinds() {
		System.out.println("Dripping Coffee throught filter");
	}

	public void pourInCup() {
		System.out.println("Pouring into cup");
	}

	public void addSugarAndMilk() {
		System.out.println("Adding sugar and milk");
	}
	
}
