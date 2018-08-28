package szu.vander.remoteproxy;

import java.rmi.RemoteException;
import java.util.List;

import szu.vander.remoteproxy.remote.BaseAutoSellerRemote;

/**
* @author      : Vander
* @date        : 2018-08-15
* @description ： 
*/
public class AutoSellerMonitor {

	private List<BaseAutoSellerRemote> autoSellerList;

	public AutoSellerMonitor(List<BaseAutoSellerRemote> autoSellerList) {
		super();
		this.autoSellerList = autoSellerList;
	}

	public void report() throws RemoteException {
		for(BaseAutoSellerRemote autoSeller : autoSellerList) {
			System.out.println("############# Monitor ############");
			System.out.println("Location ：" + autoSeller.getLocation());
			System.out.println("State ：" + autoSeller.getState());
			System.out.println("Orange count :" + autoSeller.getCount());
			System.out.println("############# Monitor ############");
		}
	}
	
}
