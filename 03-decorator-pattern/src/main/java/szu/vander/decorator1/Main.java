package szu.vander.decorator1;
/**
* @author : Vander Choi
* @date : 2018-04-17
* @description :
*/
public class Main {

	public static void main(String[] args) {
		
		Beverage beverage = new DarkRoast();
		beverage = new Whip(beverage);
		beverage = new Mocha(beverage);
		System.out.println("decription : " + beverage.getDesc());
		System.out.println("price : " + beverage.cost());
				
	}
	
}
