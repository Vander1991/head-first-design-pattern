package szu.vander.remoteproxy.state;

import szu.vander.remoteproxy.remote.AutoSeller;

/**
* @author      : Vander
* @date        : 2018-08-08
* @description ： 
*/
public class SoldOutState implements State {

	private static final long serialVersionUID = -3680075059209054474L;
	
	AutoSeller autoSeller;
	
	public SoldOutState(AutoSeller autoSeller) {
		this.autoSeller = autoSeller;
	}
	
	public void insertTenYuan() {
		System.out.println("You insert ten yuan, but there is no judge");
	}

	public void ejectTenYuan() {
		System.out.println("You can't eject, you haven't insert ten yuan");
	}

	public void pressSellButton() {
		System.out.println("You press the sell button, but there is no judge");
	}

	public void dispense() {
		System.out.println("System error");
	}

}
