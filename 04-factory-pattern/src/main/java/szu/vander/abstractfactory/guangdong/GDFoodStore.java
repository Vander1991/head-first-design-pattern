package szu.vander.abstractfactory.guangdong;

import szu.vander.abstractfactory.FoodStore;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class GDFoodStore extends FoodStore {
	
	public GDFoodStore() {
		foodFactory = new GDFoodFactory();
	}
	
}
