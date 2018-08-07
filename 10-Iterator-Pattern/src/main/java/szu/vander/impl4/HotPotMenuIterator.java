package szu.vander.impl4;

import java.util.Iterator;
import java.util.Map;

/**
* @author : Vander Choi
* @date : 2018-07-29
* @description :
*/
public class HotPotMenuIterator implements Iterator<MenuItem>  {

	private Map<String, MenuItem> itemMap; 
	
	private Iterator<String> itemSetIterator;
	
	public HotPotMenuIterator(Map<String, MenuItem> itemMap) {
		this.itemMap = itemMap;
		itemSetIterator = itemMap.keySet().iterator();
	}
	
	public boolean hasNext() {
		if(itemSetIterator.hasNext()) {
			return true;
		}
		return false;
	}

	public MenuItem next() {
		MenuItem menuItem = itemMap.get(itemSetIterator.next());
		return menuItem;
	}

}
