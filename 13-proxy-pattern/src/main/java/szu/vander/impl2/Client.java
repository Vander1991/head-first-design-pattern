package szu.vander.impl2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import szu.vander.impl2.remote.AutoSeller;
import szu.vander.impl2.remote.BaseAutoSellerRemote;

/**
* @author      : Vander
* @date        : 2018-08-08
* @description ： 
*/
public class Client {

	public static void main(String[] args) {
		String url = "rmi://localhost/";
		BaseAutoSellerRemote autoSeller = null;
		try {
			 autoSeller = (BaseAutoSellerRemote) Naming.lookup(url + "autoSeller");
		} catch (MalformedURLException | RemoteException | NotBoundException e1) {
			e1.printStackTrace();
		}
		
		List<AutoSeller> autoSellerList = new ArrayList<AutoSeller>();
		autoSellerList.add((AutoSeller)autoSeller);
		AutoSellerMonitor autoSellerMonitor = new AutoSellerMonitor(autoSellerList);
		
		autoSellerMonitor.report();
		
	}
	
}
