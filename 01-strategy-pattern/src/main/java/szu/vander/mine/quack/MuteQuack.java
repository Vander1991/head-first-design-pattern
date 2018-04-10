package szu.vander.mine.quack;

import szu.vander.mine.animal.Animal;

/**
* @author : Vander Choi
* @date : 2018-03-10
* @description :
*/
public class MuteQuack implements QuackBehavior{

	public void quack(Animal animal) {
		System.out.println(animal.getName() + " : 不会叫");
	}

}
