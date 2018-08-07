package szu.vander.menu2;

/**
* @author      : Vander
* @date        : 2018-08-01
* @description ： 
*/
public class Main {

	public static void main(String args[]) {
		
		Menu totalMenu = new Menu("TotalMenu", "TotalMenu");
		
		Menu pizzaMenu = new Menu("PizzaMenu", "PizzaMenu");
		Menu barbecueMenu = new Menu("barbecueMenu", "barbecueMenu");
		Menu milkTeaMenu = new Menu("milkTeaMenu", "milkTeaMenu");
		Menu hotPotMenu = new Menu("hotPotMenu", "hotPotMenu");
		
		pizzaMenu.add(new MenuItem("FruitPizza", "Hawaii Style", 38.0));
		pizzaMenu.add(new MenuItem("BuffPizza", "American Style", 28.0));
		pizzaMenu.add(new MenuItem("TunaPizza", "Japan Style", 18.0));
		
		milkTeaMenu.add(new MenuItem("Bubble milk tea", "big cup", 10.0));
		milkTeaMenu.add(new MenuItem("Coconut milk tea", "middle cup", 8.0));
		milkTeaMenu.add(new MenuItem("cheese tea", "middle cup", 18.0));
		
		hotPotMenu.add(new MenuItem("chicken", "with solt", 10));
		hotPotMenu.add(new MenuItem("tofu", "with solt", 5));
		hotPotMenu.add(new MenuItem("lettuce", "with solt", 10));
		
		barbecueMenu.add(new MenuItem("corn", "with pepper", 10));
		barbecueMenu.add(new MenuItem("chicken", "with pepper", 10));
		barbecueMenu.add(new MenuItem("fragrant-flowered garlic", "with pepper", 10));
		barbecueMenu.add(milkTeaMenu);

		totalMenu.add(hotPotMenu);
		totalMenu.add(barbecueMenu);
		totalMenu.add(pizzaMenu);
		
		MenuAdmin menuAdmin = new MenuAdmin(totalMenu);
		menuAdmin.print();
		
	}
	
}
