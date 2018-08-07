package szu.vander.menu1;
/**
* @author      : Vander
* @date        : 2018-08-01
* @description ： 
*/
public class MenuAdmin {

	private MenuComponent menuComponent;

	public MenuAdmin(MenuComponent menuComponent) {
		super();
		this.menuComponent = menuComponent;
	}

	public void print() {
		menuComponent.print();
	}
	
}
