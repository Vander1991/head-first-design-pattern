package szu.vander.mine.animal.duck;

import szu.vander.mine.fly.FlyBehavior;
import szu.vander.mine.fly.FlyWithWing;
import szu.vander.mine.quack.Quack;
import szu.vander.mine.quack.QuackBehavior;

/**
* @author : Vander Choi
* @date : 2018-03-10
* @description : 野鸭子
*/
public class MallardDuck extends Duck {

	private FlyBehavior flyBehavior;
	
	private QuackBehavior quackBehavior;
	
	public MallardDuck(String name) {
		super(name);
		this.flyBehavior = new FlyWithWing();
		this.quackBehavior = new Quack();
	}

	public void swim() {
		System.out.println("marllardDuck swimming");
	}
	
	public void display() {
		System.out.println("marllardDuck display");
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
