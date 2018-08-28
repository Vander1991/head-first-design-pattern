package szu.vander.noproxy.state;

import java.util.Random;

import szu.vander.noproxy.AutoSeller;

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
		Random random = new Random();
		int randomNum = random.nextInt(1);
		if(randomNum == 0) {
			autoSeller.setState(autoSeller.getWinnerState());
		} else {
			autoSeller.setState(autoSeller.getSoldState());
		}
	}

	public void dispense() {
		System.out.println("System error");
	}

}
