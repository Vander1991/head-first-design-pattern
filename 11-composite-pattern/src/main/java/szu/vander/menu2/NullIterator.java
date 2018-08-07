package szu.vander.menu2;

import java.util.Iterator;

/**
* @author      : Vander
* @date        : 2018-08-01
* @description ： 
*/
public class NullIterator implements Iterator<MenuComponent> {

	public boolean hasNext() {
		return false;
	}

	public MenuComponent next() {
		return null;
	}

}
