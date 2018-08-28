package szu.vander.noproxy;

import java.util.ArrayList;
import java.util.List;

/**
* @author      : Vander
* @date        : 2018-08-08
* @description ： 
*/
public class Main {

	public static void main(String[] args) {
		
		AutoSeller autoSeller = new AutoSeller("Paris Louvre Museum", 10);
		List<AutoSeller> autoSellerList = new ArrayList<AutoSeller>();
		autoSellerList.add(autoSeller);
		AutoSellerMonitor autoSellerMonitor = new AutoSellerMonitor(autoSellerList);
		
		autoSeller.insertTenYuan();
		autoSeller.pressSellButton();
		
		autoSeller.ejectTenYuan();
		
		autoSellerMonitor.report();
		
		autoSeller.insertTenYuan();
		autoSeller.ejectTenYuan();
		
		autoSeller.insertTenYuan();
		autoSeller.pressSellButton();
		
		autoSeller.insertTenYuan();
		autoSeller.pressSellButton();
		
	}
	
}
