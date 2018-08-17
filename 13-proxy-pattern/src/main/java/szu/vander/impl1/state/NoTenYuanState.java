package szu.vander.impl1.state;

import szu.vander.impl1.AutoSeller;

/**
* @author      : Vander
* @date        : 2018-08-08
* @description ： 
*/
public class NoTenYuanState implements State {

	private AutoSeller autoSeller;
	
	public NoTenYuanState(AutoSeller autoSeller) {
		this.autoSeller = autoSeller;
	}

	public void insertTenYuan() {
		System.out.println("You insert ten yuan!");
		autoSeller.setState(autoSeller.getHasTenYuanState());
	}

	public void ejectTenYuan() {
		System.out.println("You haven't insert ten yuan");
	}

	public void pressSellButton() {
		System.out.println("You press the sell button, you haven't insert ten yuan");
	}

	public void dispense() {
		System.out.println("System error");
	}

}
