package szu.vander.impl1;
/**
* @author      : Vander
* @date        : 2018-08-08
* @description ： 
*/
public class Main {

	public static void main(String[] args) {
		AutoSeller autoSeller = new AutoSeller(10);
		autoSeller.insertTenYuan();
		autoSeller.pressSellButton();
		autoSeller.dispense();
		
		autoSeller.dispense();
		
		autoSeller.ejectTenYuan();
		
		autoSeller.insertTenYuan();
		autoSeller.ejectTenYuan();
		
	}
	
}
