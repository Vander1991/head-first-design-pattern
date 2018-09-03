package szu.vander.duck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
* @author      : Vander
* @date        : 2018-09-03
* @description ： 
*/
public class DuckFlock implements Quackable {

	private List<Quackable> quackers = new ArrayList<Quackable>();
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) {
			iterator.next().quack();
		}
	}
	
}
