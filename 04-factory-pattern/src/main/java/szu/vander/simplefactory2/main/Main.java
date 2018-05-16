package szu.vander.simplefactory2.main;

import szu.vander.simplefactory2.guangdong.GDPizzaStore;
import szu.vander.simplefactory2.sichuan.SCPizzaStore;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/

public class Main {

	public static void main(String[] args) {
		GDPizzaStore gdPizzaStore = new GDPizzaStore();
		gdPizzaStore.orderPizza("fruits");
		
		SCPizzaStore scPizzaStore = new SCPizzaStore();
		scPizzaStore.orderPizza("fruits");
	}

}
