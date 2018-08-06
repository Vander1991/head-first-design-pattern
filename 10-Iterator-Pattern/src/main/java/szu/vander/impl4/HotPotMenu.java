package szu.vander.impl4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
* @author : Vander Choi
* @date : 2018-07-29
* @description :
*/
public class HotPotMenu implements Menu<MenuItem>{

	private Map<String, MenuItem> itemMap; 
	
	public HotPotMenu(){
		itemMap = new HashMap<String, MenuItem>();
		itemMap.put("lotus root", new MenuItem("lotus root", "with salt", 10));
		itemMap.put("tofu", new MenuItem("tofu", "with salt", 5));
		itemMap.put("potatos", new MenuItem("potatos", "with salt", 10));
	}
	
	public Iterator<MenuItem> createIterator() {
		HotPotMenuIterator hotPotMenuIterator = new HotPotMenuIterator(itemMap);
		return hotPotMenuIterator;
	}

}
