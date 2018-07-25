package szu.vander.beverage1;
/**
* @author      : caiwj
* @date        : 2018-07-10
* @description ： 
*/
public class MilkTea {

	void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addTeaAndMilk();
	}

	public void boilWater() {
		System.out.println("Boiling water");
	}

	public void pourInCup() {
		System.out.println("Pouring into cup");
	}

	public void steepTeaBag() {
		System.out.println("Steeping the tea");
	}

	public void addTeaAndMilk() {
		System.out.println("Adding tea and milk");
	}
	
}
