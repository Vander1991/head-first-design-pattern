package szu.vander.impl2;

/**
 * 
* @author      : Vander Choi
* @date        : 2018-07-26
* @description ：
 */
public class BarbecueMenuIterator implements Iterator<MenuItem> {

	private MenuItem[] menuItems;
	
	private int position = 0;
	
	public BarbecueMenuIterator(MenuItem[] menuItems) {
		super();
		this.menuItems = menuItems;
	}

	public boolean hasNext() {
		if(position >= 0 && menuItems[position] != null) {
			return true;
		}
		return false;
	}

	public MenuItem next() {
		if(position >= 0 && menuItems[position] != null) {
			MenuItem item = menuItems[position];  
			position++;
			return item;
		}
		return null;
	}

}
