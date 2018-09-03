package szu.vander.duck;
/**
* @author      : Vander
* @date        : 2018-09-03
* @description ： 
*/
public class GooseAdapter implements Quackable {

	private Goose goose;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
	
	public void quack() {
		goose.honk();
	}

}
