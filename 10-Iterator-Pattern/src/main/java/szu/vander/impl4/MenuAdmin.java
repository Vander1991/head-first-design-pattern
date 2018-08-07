package szu.vander.impl4;

import java.util.Iterator;
import java.util.List;

/**
 * @author : Vander Choi
 * @date : 2018-07-25
 * @description :
 */
public class MenuAdmin {

	private List<Menu<MenuItem>> menuList;

	public MenuAdmin(List<Menu<MenuItem>> menuList) {
		this.menuList = menuList;
	}
	
	public void displayMenus() {
		for(Menu<MenuItem> menu : menuList) {
			traverseMenus(menu.createIterator());
		}
	}
	
	public void traverseMenus(Iterator<MenuItem> iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.println("name:" + menuItem.getName() + "-desc:" + menuItem.getDesc()
					+ "-price:" + menuItem.getPrice());
		}
	}
	
}
