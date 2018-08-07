package szu.vander.impl2;

/**
 * @author : Vander Choi
 * @date : 2018-07-25
 * @description :
 */
public class MenuAdmin {

	private BarbecueMenu barbecueMenu;

	private PizzaMenu pizzaMenu;

	public MenuAdmin(BarbecueMenu barbecueMenu, PizzaMenu pizzaMenu) {
		super();
		this.barbecueMenu = barbecueMenu;
		this.pizzaMenu = pizzaMenu;
	}
	
	public void displayMenus() {
		traverseMenus(barbecueMenu.createIterator());
		traverseMenus(pizzaMenu.createIterator());
	}
	
	public void traverseMenus(Iterator<MenuItem> iterator) {
		while(iterator.hasNext()) {
			System.out.println("name:" + iterator.next().getName() + "-desc:" + iterator.next().getDesc()
					+ "-price:" + iterator.next().getPrice());
		}
	}
	
}
