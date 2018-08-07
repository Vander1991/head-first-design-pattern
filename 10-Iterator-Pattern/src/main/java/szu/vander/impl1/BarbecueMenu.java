package szu.vander.impl1;
/**
* @author : Vander Choi
* @date : 2018-07-25
* @description :
*/
public class BarbecueMenu {

	private static final int MAX_ITEMS = 5;
	
	private int numberOfIterms = 0;
	
	private MenuItem[] menuItems;
	
	public BarbecueMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem(new MenuItem("chicken", "with pepper", 10));
		addItem(new MenuItem("tofu", "with pepper", 5));
		addItem(new MenuItem("fragrant-flowered garlic", "with pepper", 10));
	}
	
	public void addItem(MenuItem menuItem) {
		if(numberOfIterms >= MAX_ITEMS) {
			System.err.println("sorry, menu is full!");
		} else {
			menuItems[numberOfIterms] = menuItem;
			numberOfIterms = numberOfIterms + 1;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}
	
}
