package szu.vander.impl2;
/**
* @author      : Vander
* @date        : 2018-08-08
* @description ： 
*/
public class HasTenYuanState implements State {

	private AutoSeller autoSeller;
	
	public HasTenYuanState(AutoSeller autoSeller) {
		this.autoSeller = autoSeller;
	}

	public void insertTenYuan() {
		System.out.println("The machine has ten yuan, don't repeat doing it");
	}

	public void ejectTenYuan() {
		System.out.println("Ten yuan returned");
		autoSeller.setState(autoSeller.getNoTenYuanState());
	}

	public void pressSellButton() {
		System.out.println("You press the sell button, give you the judge");
		autoSeller.setState(autoSeller.getSoldState());
	}

	public void dispense() {
		System.out.println("System error");
	}

}
