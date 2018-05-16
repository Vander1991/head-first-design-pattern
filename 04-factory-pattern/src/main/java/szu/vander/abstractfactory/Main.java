package szu.vander.abstractfactory;

import szu.vander.abstractfactory.guangdong.GDFoodStore;
import szu.vander.abstractfactory.sichuan.SCFoodStore;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/

public class Main {

	public static void main(String[] args) {
		
		System.out.println("GuangDong Restaurant:");
		GDFoodStore gdFoodStore = new GDFoodStore();
		gdFoodStore.orderPizza("fruits");
		gdFoodStore.orderBurger("salt");
		gdFoodStore.orderBeverage("sweet");
		gdFoodStore.orderFiredChicken("salt");
		
		System.out.println("\nSiChuan Restaurant:");
		SCFoodStore scFoodStore = new SCFoodStore();
		scFoodStore.orderPizza("fruits");
	}

}
