package szu.vander.mine.animal.duck;

import szu.vander.mine.animal.Animal;

/**
* @author : Vander Choi
* @date : 2018-03-10
* @description :
*/
public class Duck extends Animal{
	
	public Duck(String name) {
		super(name);
	}

	/**
	 * 定义swim方法在子类中实现
	 */
	public void swim(Animal animal) {
		System.out.println(animal.getName() + ": 在游泳");
	};
	
	/**
	 * 定义display方法在子类中实现
	 */
	public void display(Animal animal) {
		System.out.println(animal.getName() + ": 在展示");
	}
	
}
