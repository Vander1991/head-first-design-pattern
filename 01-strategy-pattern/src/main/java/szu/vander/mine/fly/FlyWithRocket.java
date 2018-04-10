package szu.vander.mine.fly;

import szu.vander.mine.animal.Animal;

/**
* @author : Vander Choi
* @date : 2018-03-11
* @description :
*/
public class FlyWithRocket implements FlyBehavior{

	public void fly(Animal animal) {
		System.out.println(animal.getName() + " : 用火箭飞");
	}

}
