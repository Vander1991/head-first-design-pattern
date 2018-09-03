package szu.vander.duck;
/**
* @author      : Vander
* @date        : 2018-09-03
* @description ： 
*/
public class QuackCounter implements Quackable {

	private Quackable duck;
	
	static int quackNum = 0;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	
	public void quack() {
		duck.quack();
		quackNum++;
	}
	
	public int getQuackNum() {
		return quackNum;
	}

}
