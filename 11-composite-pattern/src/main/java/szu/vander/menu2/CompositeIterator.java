package szu.vander.menu2;

import java.util.Iterator;
import java.util.Stack;

/**
* @author      : Vander
* @date        : 2018-08-01
* @description ： 
*/
public class CompositeIterator implements Iterator<MenuComponent> {

	private Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	public MenuComponent next() {
		if(hasNext()) {
			Iterator<MenuComponent> itemIterator = stack.peek();
			MenuComponent component = itemIterator.next();
			if(component instanceof Menu) {
				stack.push(component.createIteractor());
			}
			return component;
		}
		return null;
	}

}
