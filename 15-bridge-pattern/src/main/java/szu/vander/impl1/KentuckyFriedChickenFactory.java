package szu.vander.impl1;
/**
* @author      : Vander
* @date        : 2018-10-02
* @description ： 
*/
public class KentuckyFriedChickenFactory extends Kentucky  {

	private final String RESTAURANT_NAME = this.getClass().getSuperclass().getSimpleName();
	
	public void makeFood() {
		System.out.println("生产" + RESTAURANT_NAME + "的炸鸡");
	}
	
}
