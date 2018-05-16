package szu.vander.factorymethod.main;

import szu.vander.factorymethod.Pizza;
import szu.vander.factorymethod.guangdong.GDPizzaStore;
import szu.vander.factorymethod.sichuan.SCPizzaStore;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class Main {

	public static void main(String[] args) {
		GDPizzaStore gdPizzaStore = new GDPizzaStore();
		Pizza gdFruitsPizza1 = gdPizzaStore.orderPizza("fruits");
		SCPizzaStore scPizzaStore = new SCPizzaStore();
		Pizza scfruitsPizza2 = scPizzaStore.orderPizza("fruits");
	}

}
