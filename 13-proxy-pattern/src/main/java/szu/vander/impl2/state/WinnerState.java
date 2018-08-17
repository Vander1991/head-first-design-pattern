package szu.vander.impl2.state;

import szu.vander.impl2.remote.AutoSeller;

/**
* @author      : Vander
* @date        : 2018-08-12
* @description ： 
*/
public class WinnerState implements State {

	private AutoSeller autoSeller;
	
	public WinnerState(AutoSeller autoSeller){
		this.autoSeller = autoSeller;
	}
	
	public void insertTenYuan() {
		System.out.println("System error");
	}

	public void ejectTenYuan() {
		System.out.println("System error");
	}

	public void pressSellButton() {
		System.out.println("System error");
	}

	public void dispense() {
		System.out.println("You're the winner!");
		autoSeller.dispense();
		if(autoSeller.getCount() == 0) {
			autoSeller.setState(autoSeller.getSoldOutState());
		} else {
			autoSeller.dispense();
			if(autoSeller.getCount() > 0) {
				autoSeller.setState(autoSeller.getNoTenYuanState());
			} else {
				System.out.println("Oops, out of judge!");
				autoSeller.setState(autoSeller.getSoldOutState());
			}
			
		}
	}

}
