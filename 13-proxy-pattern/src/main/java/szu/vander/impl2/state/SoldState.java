package szu.vander.impl2.state;

import szu.vander.impl2.remote.AutoSeller;

/**
* @author      : Vander
* @date        : 2018-08-08
* @description ： 
*/
public class SoldState implements State {

	private AutoSeller autoSeller;
	
	public SoldState(AutoSeller autoSeller) {
		this.autoSeller = autoSeller;
	}
	
	public void insertTenYuan() {
		System.out.println("Please wait， we're already giving you a cup of judge");
	}

	public void ejectTenYuan() {
		System.out.println("Sorry, you already press the sell button");
	}

	public void pressSellButton() {
		System.out.println("Sorry, you already press the sell button");
	}

	public void dispense() {
		autoSeller.dispense();
		if(autoSeller.getCount() > 0) {
			autoSeller.setState(autoSeller.getNoTenYuanState());
		} else {
			autoSeller.setState(autoSeller.getSoldOutState());
		}
	}

}
