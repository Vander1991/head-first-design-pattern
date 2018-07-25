package szu.vander.beverage2;

/**
 * 
 * @author      : caiwj
 * @date        : 2018-07-12
 * @description ：
 *
 */
public class Coffee extends Beverage {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee throught filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	
}