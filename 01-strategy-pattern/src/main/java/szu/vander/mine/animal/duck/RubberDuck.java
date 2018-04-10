package szu.vander.mine.animal.duck;

import szu.vander.mine.fly.FlyBehavior;
import szu.vander.mine.fly.FlyNoWay;
import szu.vander.mine.quack.QuackBehavior;
import szu.vander.mine.quack.Squack;

/**
* @author : Vander Choi
* @date : 2018-03-10
* @description :
*/
public class RubberDuck extends Duck{

	private FlyBehavior flyBehavior;
	
	private QuackBehavior quackBehavior;
	
	public RubberDuck(String name) {
		super(name);
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Squack();
	}

	public void swim() {
		System.out.println("rubberduck swimming");
	}
	
	public void display() {
		System.out.println("rubberduck displaying");
	}
	
	public void fly() {
		flyBehavior.fly(this);
	}
	
	public void quack() {
		quackBehavior.quack(this);
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
