package szu.vander.mine.fly;

import szu.vander.mine.animal.Animal;

/**
* @author : Vander Choi
* @date : 2018-03-10
* @description :
*/
public class FlyNoWay implements FlyBehavior {

	public void fly(Animal animal) {
		System.out.println(animal.getName() + " : 不会飞");
	}
	
}
