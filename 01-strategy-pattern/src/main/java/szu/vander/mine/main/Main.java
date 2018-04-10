package szu.vander.mine.main;

import szu.vander.mine.animal.duck.MallardDuck;
import szu.vander.mine.animal.duck.RubberDuck;
import szu.vander.mine.fly.FlyWithRocket;

/**
* @author : Vander Choi
* @date : 2018-03-10
* @description :
*/
public class Main {

	public static void main(String[] args) {
		
		FlyWithRocket flyWithRocket = new FlyWithRocket();
		
		MallardDuck mallardDuck = new MallardDuck("mallardDuck");
		RubberDuck rubberDuck = new RubberDuck("rubberDuck");
		rubberDuck.setFlyBehavior(flyWithRocket);
		mallardDuck.quack();
		rubberDuck.quack();
		mallardDuck.fly();
		rubberDuck.fly();
		
	}

}
