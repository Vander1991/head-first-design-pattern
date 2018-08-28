package szu.vander.noproxy;

import java.util.List;

/**
* @author      : Vander
* @date        : 2018-08-15
* @description ： 
*/
public class AutoSellerMonitor {

	private List<AutoSeller> autoSellerList;

	public AutoSellerMonitor(List<AutoSeller> autoSellerList) {
		super();
		this.autoSellerList = autoSellerList;
	}

	public void report() {
		for(AutoSeller autoSeller : autoSellerList) {
			System.out.println("############# Monitor ############");
			System.out.println("Location ：" + autoSeller.getLocation());
			System.out.println("State ：" + autoSeller.getState());
			System.out.println("Orange count :" + autoSeller.getCount());
			System.out.println("############# Monitor ############");
		}
	}
	
}
